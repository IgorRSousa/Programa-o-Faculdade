package Lista3;

import javax.swing.JOptionPane;

class Cartao{
    private String senha;
    
    public Cartao(String senha){
        this.senha=senha;
    }
    
    public boolean verificarSenha(String senha){
        return this.senha.equals(senha);
    }
    
    public boolean verificarSenha(){
        return this.senha.equals(JOptionPane.showInputDialog("Insira a senha: "));
    }
}

class Conta{
    private int nro;
    private String nomeTitular;
    private float saldo;
    private Cartao senha;
    
    
    
    public Conta(int nro, String nome, float saldo){
        this.nro = nro;
        this.nomeTitular = nome;
        this.saldo=saldo;  
        System.out.println(this.nro);
    }
    public Conta(){
        this.nro=Integer.parseInt(JOptionPane.showInputDialog("Insira o Numero da conta!"));
        this.nomeTitular=JOptionPane.showInputDialog("Insira o Nome do Titular!");
        this.saldo=Float.parseFloat(JOptionPane.showInputDialog("Insira o Saldo!"));
        this.senha=new Cartao(JOptionPane.showInputDialog("Digite a Senha: "));
    
    }   
    public void Depositar(float valor){
        this.saldo+=valor;
    }
    public boolean Sacar(float valor){
        if(valor>this.saldo){
            return false;
        }else{
            this.saldo-=valor;
            return true;
        }
    }
    public float getSaldo(){
        return this.saldo;
    }
    public String getNomeTitular(){
        return this.nomeTitular;
    }
    public Cartao getCartao(){
        return this.senha;
    }
}//conta

public class E1_Conta_De_Banco_2{
    public static void main(String args[]){
        
        //Conta Cliente=new Conta(123, "Joao da Silva", 300);
        Conta Cliente=new Conta();
        int opcao=0;
        do{
            opcao=Integer.parseInt(JOptionPane.showInputDialog("Conta Corrente\n"
                    +                                          "1-Deposito\n"
                    +                                          "2-Saque\n"
                    +                                          "3-Consultar Saldo\n"
                    +                                          "4-Finalizar\n"));
            
            if(opcao==1||opcao==2||opcao==3){
                if(Cliente.getCartao().verificarSenha()){
                    switch(opcao){
                        case 1 : 
                            float valor;
                            valor=Float.parseFloat(JOptionPane.showInputDialog("Valor a ser Depositado!"));
                            Cliente.Depositar(valor);
                            break;
                        case 2 :
                            valor=Float.parseFloat(JOptionPane.showInputDialog("Valor do Saque!!"));
                            if(Cliente.Sacar(valor)){
                                JOptionPane.showInternalMessageDialog(null,"Saque Efetuado!");
                            }else{
                                JOptionPane.showInternalMessageDialog(null,"Saldo Insuficiente!");
                            }
                            break;
                        case 3 :
                            JOptionPane.showInternalMessageDialog(null,"\nNome do Titular: "+Cliente.getNomeTitular()+"\nSaldo: "+Cliente.getSaldo());
                            break;
                        case 4 :break;

                        default: JOptionPane.showInternalMessageDialog(null,"!!! Opcao Invalida !!!");
                    }
                }else{
                    JOptionPane.showInternalMessageDialog(null,"!! Senha Incorreta !!");
                }
            }
        }while(opcao!=4);
    }//main
}