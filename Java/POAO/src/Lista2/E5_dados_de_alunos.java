package Lista2;

import javax.swing.JOptionPane;

class Aluno{
    private String ra;
    private String nome;
    private float p1;
    private float p2;
    private float media;

    
    public Aluno(String a, String b){
    this.ra=a;
    this.nome=b;
    System.out.println(this.ra+this.nome);
    }
    public void atribuirNota(float NotaP1, float NotaP2){
        this.p1 = NotaP1;
        this.p2 = NotaP2;
    }
    public void calcularMedia(){
        this.media=(this.p1 + this.p2)/2;
    }
    public String verificarSituaçao(){
        if(this.media>7){
            return "Aprovado";
        }else{
            if(this.media>=4){
                return "Exame";
            }else{
                return "Reprovado";
            }
        }
    }
    public float getMedia(){
        return this.media;
        
    }
}

public class E5_dados_de_alunos {
    public static void main(String args[]){
        Aluno x=new Aluno("607568","Igor Sousa");
        x.atribuirNota(Float.parseFloat(JOptionPane.showInputDialog("Insira Nota P1:")), Float.parseFloat(JOptionPane.showInputDialog("Insira Nota P2:")));
        x.calcularMedia();
        JOptionPane.showInternalMessageDialog(null,"Media: "+x.getMedia()+"\nSituação : "+ x.verificarSituaçao());
    } 
}
