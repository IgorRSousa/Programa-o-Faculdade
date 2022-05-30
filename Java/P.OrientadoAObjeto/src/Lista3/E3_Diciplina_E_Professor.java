package Lista3;

import javax.swing.JOptionPane;

class Professor{
    private String Nome;
    private String Formação;
    private String Titulação;

    public Professor(String Nome,String Formação,String Titulação){
        this.Nome=Nome;
        this.Formação=Formação;
        this.Titulação=Titulação;
    }
    public String getNome(){
        return this.Nome;
    }
    public String getFormação() {
        return Formação;
    }
    public String getTitulação() {
        return Titulação;
    }
}

class Disciplina {
    private int codigo;
    private String Nome;
    private int cargaHoraria;
    private Professor Professor;
    
    public Disciplina(int codigo, String Nome, int cargaHoraria){
        this.codigo=codigo;
        this.Nome=Nome;
        this.cargaHoraria=cargaHoraria;
    }

    public String getNome(){
        return this.Nome;
    }
    
    public void setProfessor(Professor Professor){
        this.Professor=Professor;
    }

    public Professor getProfessor(){
        return this.Professor;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public int getCodigo() {
        return codigo;
    }
}

public class E3_Diciplina_E_Professor {
   public static void main(String args[]){
       Disciplina d=new Disciplina(1234,"Programação Orientada a", 80);
       Professor p1=new Professor("Adriano Sunao Nakamura", "Ciência da Computação", "Doutor");
       //Professor p2=new Professor("Mauricio Duarte", "Ciência da Computação", "Mestre");
       d.setProfessor(p1);
       JOptionPane.showMessageDialog(null,"Professor :"+d.getProfessor().getNome()+"\nNome da Diciplina: "+ d.getNome());
   }
}
