package Lista4;

import javax.swing.JOptionPane;

class Veiculo{
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    
    public Veiculo(String placa, String marca, String modelo, String cor){
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.cor=cor;
    }
    public String getPlaca(){
        return this.placa;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getMarca() {
        return this.marca;
    }
    public String getCor() {
        return this.cor;
    }
}

class Motorista{
    private String cnh;
    private String categoria;
    private String nome;
    private Veiculo carro;

    public Motorista(String cnh, String categoria, String nome){
        this.cnh=cnh;
        this.categoria=categoria;
        this.nome=nome;

    }

    public String getCNH(){
        return this.cnh;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public String getNome(){
        return this.nome;
    }
    public Veiculo getCarro(){
        return this.carro;
    }

    public void setCarro(Veiculo carro){
        this.carro=carro;
    }
}

public class E1_Motorista_e_Veiculo {
    public static void main(String args[]){
        Veiculo A =new Veiculo("DTI2H28","Honda","CG 150","Cinza");
        //Veiculo B =new Veiculo("DTI2T30","Yamaha","Fazer 250","Preta");

        Motorista x = new Motorista("00123456789","AB", "Igor Sousa");
        x.setCarro(A);

        JOptionPane.showMessageDialog(null,"Nome do Motorista: "+x.getNome()+"\nNumero da CNH: "+x.getCNH()+"\nCategoria: "+x.getCategoria()+
                                      "\n\nImfomações do Veiculo:"+"\nModelo: "+x.getCarro().getModelo()+"\nPlaca: "+x.getCarro().getPlaca());
    }
}
