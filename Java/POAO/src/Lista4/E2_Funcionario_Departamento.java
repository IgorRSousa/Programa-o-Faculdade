package Lista4;

import javax.swing.JOptionPane;

class Departamento{
    private int codigo;
    private String nome;
    private String sigla;

    public Departamento(int codigo, String nome, String sigla){
        this.codigo=codigo;
        this.nome=nome;
        this.sigla=sigla;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public String getSigla(){
        return this.sigla;
    }
}

class Funcionario{
    private int codigo;
    private String nome;
    private float salario;
    private Departamento depto;

    public Funcionario(int codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
    }

    public void setSalario(float salario){
        this.salario=salario;
    }

    public void setDepartamento(Departamento depto){
        this.depto=depto;
    }

    public int getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSalario(){
        return this.salario;
    }
    public Departamento getDepto(){
        return this.depto;
    }
}

public class E2_Funcionario_Departamento {
    public static void main(String args[]){
        Departamento A=new Departamento(123456,"Teste de Qualidade","OQC");
        Departamento B=new Departamento(654321,"Laboratorio de Reparo","Lab");

        Funcionario C=new Funcionario(147852,"Lucas");
        Funcionario D=new Funcionario(258741,"Pedro");

        C.setDepartamento(A);
        D.setDepartamento(B);

        C.setSalario(1751.21f);
        D.setSalario(1520.10f);

        if(C.getSalario()>D.getSalario()){
            JOptionPane.showMessageDialog(null,"Nome: "+ C.getNome()+ " - Departemento: "+C.getDepto().getNome()+
                                               "\nNome: "+ D.getNome()+ " - Departemento: "+D.getDepto().getNome()+
                                               "\nFuncionario com Maior salario: "+C.getNome()+"- R$"+C.getSalario());
        }else{
            JOptionPane.showMessageDialog(null,"Nome: "+ C.getNome()+ " - Departemento: "+C.getDepto().getNome()+
                                               "\nNome: "+ D.getNome()+ " - Departemento: "+D.getDepto().getNome()+
                                               "\nFuncionario com Maior salario: "+D.getNome()+"- R$"+D.getSalario());
        }
    }
}
