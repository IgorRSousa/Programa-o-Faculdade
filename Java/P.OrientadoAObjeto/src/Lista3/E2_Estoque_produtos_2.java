package Lista3;

import javax.swing.JOptionPane;

class Fabricante{
    
    private String nome;
    private String endereço;
    private String fone; 

    public Fabricante(String nome, String endereço,String fone ){
        this.nome=nome;
        this.endereço=endereço;
        this.fone=fone;
    } 
    
    public void atualizaFone(String novoFone){
        this.fone=novoFone;
    }

    public String getFone(){
        return this.fone;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEndereço(){
        return this.endereço;
    }
}

class Produto{
    private String descricao;
    private float preço;
    private int qtde_disp;
    private int qtde_vend;
    private Fabricante Fabricante;
    
    public Produto(String a, float b, int c, int d,Fabricante e){
        this.descricao=a;
        this.preço=b;
        this.qtde_disp=c;
        this.qtde_vend=d;
        this.Fabricante=e;
    }

    public void Repor(int qtde){
        this.qtde_disp+=qtde;
    }
    public boolean Vender(int qtde){
        if(qtde>this.qtde_disp){
            return false;
        }else{
            this.qtde_disp-=qtde;
            this.qtde_vend+=qtde;
            return true;
        }
    }
    public void exibirDados(){
        JOptionPane.showInternalMessageDialog(null,"Descrição: "+this.descricao+"\nPreço: "+this.preço+"\nQTDE Disponivel: "+this.qtde_disp+
                "\nQTDE Vendida: "+this.qtde_vend+"\n\nFabricante:"+"\nNome:"+this.Fabricante.getNome()+"\nEndereço:"+this.Fabricante.getEndereço()+
                "\nTelefone:"+this.Fabricante.getFone());
    }
    public Fabricante getFabric(){
        return this.Fabricante;
    }
}


public class E2_Estoque_produtos_2 {
    public static void main(String args[]){
        Produto p=new Produto (JOptionPane.showInputDialog("Insira Nome do produto"),
                               Float.parseFloat(JOptionPane.showInputDialog("Insira Preço do Produto")),
                               Integer.parseInt(JOptionPane.showInputDialog("Insira Quantidade Disponivel")),
                               Integer.parseInt(JOptionPane.showInputDialog("Insira Quantidade Vendida")),
                               new Fabricante(JOptionPane.showInputDialog("Insira Nome do Fabricante"),
                                       JOptionPane.showInputDialog("Insira Endereço do Fabricante"),
                                       JOptionPane.showInputDialog("Insira Telefone do Fabricante")));
        
        p.Repor(Integer.parseInt(JOptionPane.showInputDialog("QTDE a ser reposta :")));
        if(p.Vender(Integer.parseInt(JOptionPane.showInputDialog("QTDE a ser Vendida :")))){
            JOptionPane.showInternalMessageDialog(null,"!!Venda efetuado!!");
        }else{
            JOptionPane.showInternalMessageDialog(null,"!!QTDE Insuficiente!!");
        }
        JOptionPane.showMessageDialog(null,"Telefone do Fabricante:"+p.getFabric().getFone());
        p.getFabric().atualizaFone(JOptionPane.showInputDialog("Insira o novo Telefone do Fabricante"));
        p.exibirDados();
    }
}
