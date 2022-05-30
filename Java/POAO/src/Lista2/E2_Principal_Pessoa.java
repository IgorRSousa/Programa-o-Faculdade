package Lista2;

import javax.swing.JOptionPane;

class Pessoa{
    String nome, tell;
    int idade;
    public Pessoa(String nome,String tell,int idade ){
        this.nome=nome;//this é usado para puxa variavel gloal inves da local
        this.tell=tell;
        this.idade=idade;
    }
    public void fazAniversario(){
        idade++;
    }
    public void atualizaTelefone(String novoFone){
        tell=novoFone;
    }
}//Pessoa

public class E2_Principal_Pessoa {
    public static void main(String args[]){
        String nome = JOptionPane.showInputDialog("Insira o nome: ");
        String tell = JOptionPane.showInputDialog("Insira o tell: ");
        int idade =Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: "));
        
        Pessoa p = new Pessoa(nome, tell, idade);
        System.out.println("Nome: "+p.nome+"\nTelefone: "+p.tell+"\nIdade: "+p.idade);
        p.fazAniversario();
        p.atualizaTelefone(JOptionPane.showInputDialog("Insira o novo tell: "));
        System.out.println("\nNome: "+p.nome+"\nTelefone: "+p.tell+"\nIdade: "+p.idade);
    }//main
}//principalPessoa
