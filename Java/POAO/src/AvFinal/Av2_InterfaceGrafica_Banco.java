package AvFinal;

//Nomes: Igor Sousa e Pedro Joaquim RAs: 607568 e 604038

import java.util.ArrayList;
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
    public boolean Saque(float valor){
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

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
class Banco{
    private ArrayList<Cliente> banco;

    public Banco(){
        this.banco = new ArrayList<Cliente>();
    }
    
    public void Cadastrar(Cliente c){
        this.banco.add(c);
    }
    
    public Cliente Consultar(String nome){
        for(Cliente c: this.banco)
            if(c.getNome().equals(nome))
                return c;
        return null;
    }
    
    public boolean Depositar(String nome, float valor){
        for(Cliente c: this.banco)
            if(c.getNome().equals(nome))
                c.getConta().Deposito(valor);
                return true;
    }
    
    public boolean Sacar(String nome, float valor){
        for(Cliente c: this.banco)
            if(c.getNome().equals(nome))
                c.getConta().Saque(valor);
                return true;
    }
    
    public boolean Transferir(String origem,String destino, float valor){
        for(Cliente c: this.banco)
            if(c.getNome().equals(origem))   
                for(Cliente d: this.banco)
                    if(d.getNome().equals(destino)){
                        c.getConta().Transferir(valor, d.getConta());
                        return true;
                    }
        return false;
    }
}

public class Av2_InterfaceGrafica_Banco {
    public static void main(String agrs[]){
        Banco banco = new Banco();
        String menu[]={"Cadastrar Cliente/Conta", "Consultar", "Depositar","Sacar","Transferir","Finalizar"};
        String opcao;

        do{
            opcao=JOptionPane.showInputDialog(null, "Escolha uma opcao","BANCO",JOptionPane.QUESTION_MESSAGE, null,menu, menu[0]).toString();
            switch(opcao){
                case "Cadastrar Cliente/Conta": cadastrar(banco); break;
                case "Consultar": consultar(banco); break;
                case "Depositar": depositar(banco); break;
                case "Sacar": sacar(banco); break;
                case "Transferir": transferir(banco); break;
                case "Finalizar": break;
            }//switch
        }while(!opcao.equals(menu[5]));
    }

    private static void cadastrar(Banco banco){
        String nome = JOptionPane.showInputDialog(null,"Nome: ");
        String CPF = JOptionPane.showInputDialog(null,"CPF: ");
        String endereco = JOptionPane.showInputDialog(null,"endereco: ");
        String telefone = JOptionPane.showInputDialog(null,"telefone: ");
        Conta conta = new Conta(Integer.parseInt(JOptionPane.showInputDialog(null,"Numero:  ")),
                                JOptionPane.showInputDialog(null,"Tipo: "),
                                Float.parseFloat(JOptionPane.showInputDialog(null,"Saldo: ")));
        banco.Cadastrar(new Cliente(nome, CPF, endereco, telefone, conta));
        JOptionPane.showMessageDialog(null,"!! Cadastrado com sucesso !!");
    }

    private static void consultar(Banco banco) {
        String nome = JOptionPane.showInputDialog(null,"Nome: ");
        Cliente c =banco.Consultar(nome);
        if(c!=null){
            JOptionPane.showMessageDialog(null,"Nome: "+c.getNome()+"\nCPF: "+c.getCPF()+"\nEndereco: "+c.getEndereco()+"\nTelefone: "+c.getTelefone()+
                                               "\n\nConta:"+"\nNumero: "+c.getConta().getNumero()+"\nTipo: "+c.getConta().getTipo()+"\nSaldo: "+c.getConta().getSaldo());
        }else{
            JOptionPane.showMessageDialog(null,"!! Cliente nao encontrado !!");
        }
    }
    
    private static void depositar(Banco banco) {
        String nome = JOptionPane.showInputDialog(null,"Nome: ");
        float valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Saldo: "));
        if(banco.Depositar(nome, valor)){
            JOptionPane.showMessageDialog(null,"!! Deposito Efetuado !!");
        }else{
            JOptionPane.showMessageDialog(null,"!! Deposito Nao Efetuado !!");
        }
    }

    private static void sacar(Banco banco) {
        String nome = JOptionPane.showInputDialog(null,"Nome: ");
        float valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Saldo: "));
        if(banco.Sacar(nome, valor)){
            JOptionPane.showMessageDialog(null,"!! Saque Efetuado !!");
        }else{
            JOptionPane.showMessageDialog(null,"!! Saque Nao Efetuado !!");
        }
    }

    private static void transferir(Banco banco) {
        String nomeOrigem = JOptionPane.showInputDialog(null,"Nome da Pessoa de Origem: ");
        String nomeDestino = JOptionPane.showInputDialog(null,"Nome da Pessoa de Destino: ");
        float valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Saldo: "));
        if(banco.Transferir(nomeOrigem, nomeDestino, valor)){
            JOptionPane.showMessageDialog(null,"!! Tranferencia Efetuado !!");
        }else{
            JOptionPane.showMessageDialog(null,"!! Tranferencia Nao Efetuado !!");
        }
    }
}