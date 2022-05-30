package Lista2;

import javax.swing.JOptionPane;

class Conta{
    private String nomeTitular;
    private float saldo;
    public Conta(int nro, String nome, float saldo){
        this.nomeTitular=nome;
        this.saldo=saldo;  
    }
    public Conta(){
        Integer.parseInt(JOptionPane.showInputDialog("Insira o Numero da conta!"));
        this.nomeTitular=JOptionPane.showInputDialog("Insira o Nome do Titular!");
        this.saldo=Float.parseFloat(JOptionPane.showInputDialog("Insira o Saldo!"));
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
}//conta

public class E3_Sistema_de_conta_corrente {
    public static void main(String args[]){
        
        Conta Cliente=new Conta(123, "Joao da Silva", 300);
        int opcao=0;
        do{
            opcao=Integer.parseInt(JOptionPane.showInputDialog("Conta Corrente\n"
                    +                                          "1-Deposito\n"
                    +                                          "2-Saque\n"
                    +                                          "3-Consultar Saldo\n"
                    +                                          "4-Finalizar\n"));
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
                    
        }while(opcao!=4);
    }//main
}