package Lista4;

import javax.swing.JOptionPane;

class Conta{
    private int numero;
    private String tipo;
    private float saldo;

    public Conta(int numero, String tipo, float saldo){
        this.numero=numero;
        this.tipo=tipo;
        this.saldo=saldo;
    }
    public void Deposito(float valor){
        this.saldo+=valor;
    }
    public boolean Sacar(float valor){
        if(this.saldo > valor){
            this.saldo-=valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean Transferir(float valor, Conta destino){
        if(this.saldo > valor){
            this.saldo-=valor;
            destino.saldo+=valor;
            return true;
        }else{
            return false;
        }
    }
    
    public int getNumero() {
        return this.numero;
    }
    public String getTipo() {
        return this.tipo;
    }
    public float getSaldo() {
        return this.saldo;
    }

}

class Cliente{
    private String nome;
    private String CPF;
    private String endereco;
    private String telefone;
    private Conta conta;

    public Cliente(String nome, String CPF, String endereco, String telefone, Conta conta){
        this.nome=nome;
        this.CPF=CPF;
        this.endereco=endereco;
        this.telefone=telefone;
        this.conta=conta;
    }
    public void setConta(Conta newConta){
        this.conta=newConta;
    }
    
    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public Conta getConta() {
        return conta;
    }
}

public class E3_Conta_Cliente {
    public static void main(String args []){
        
        Cliente A=new Cliente("Bianca","123.456.789-00","Fazenda","998758524",new Conta(123456,"Corrente",1530.10f));
        Cliente B=new Cliente("Bianca","123.456.789-00","Fazenda","998758524",new Conta(654321,"Corrente",1250.80f));

        A.getConta().Deposito(100);
        B.getConta().Deposito(150);

        if(A.getConta().Sacar(500)){
            JOptionPane.showMessageDialog(null,"!!Saque na conta "+A.getConta().getNumero()+" efetuado!!");
        }else{
            JOptionPane.showMessageDialog(null,"!!Conta "+A.getConta().getNumero()+" com saldo insuficiante!!");

        }
        if(B.getConta().Sacar(500)){
            JOptionPane.showMessageDialog(null,"!!Saque na conta "+B.getConta().getNumero()+" efetuado!!");
        }else{
            JOptionPane.showMessageDialog(null,"!!Conta "+B.getConta().getNumero()+" com saldo insuficiante!!");

        }

        if(A.getConta().Transferir(100,B.getConta())){
            JOptionPane.showMessageDialog(null,"!! Tranferencia Efetuada com sucesso !!");
        }else{
            JOptionPane.showMessageDialog(null,"!!Conta "+A.getConta().getNumero()+" com saldo insuficiante para trasferir!!");
        }
    }
}
