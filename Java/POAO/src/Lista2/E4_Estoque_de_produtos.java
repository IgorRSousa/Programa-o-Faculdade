package Lista2;

import javax.swing.JOptionPane;

class Produto{
    private String descricao;
    private float preço;
    private int qtde_disp;
    private int qtde_vend;
    
    public Produto(String a, float b, int c, int d){
        this.descricao=a;
        this.preço=b;
        this.qtde_disp=c;
        this.qtde_vend=d;
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
                "\nQTDE Vendida: "+this.qtde_vend);
    }
}

public class E4_Estoque_de_produtos {
    public static void main(String args[]){
        Produto p=new Produto ("Pendive 64Gb",50.80f,0,0);
        p.Repor(Integer.parseInt(JOptionPane.showInputDialog("QTDE a ser reposta :")));
        if(p.Vender(Integer.parseInt(JOptionPane.showInputDialog("QTDE a ser Vendida :")))){
            JOptionPane.showInternalMessageDialog(null,"!!Venda efetuado!!");
        }else{
            JOptionPane.showInternalMessageDialog(null,"!!QTDE Insuficiente!!");
        }
        p.exibirDados();
    }
}

/*
Cod Prof 
package exemplo;
        
import java.util.Scanner;

class Produto{
private String descricao;
private float preco;
private int qtdeDisp=0, qtdeVend=0;

public Produto(String descricao, float preco){
this.descricao=descricao;
this.preco=preco;
}
public void repor(int qtde){
this.qtdeDisp+=qtde;
}
public boolean vender(int qtde){
if(qtde>this.qtdeDisp) return false;
this.qtdeDisp-=qtde;
this.qtdeVend+=qtde;
return true;
}
public void exibirDados(){
System.out.println("Descrição: "+this.descricao+
"\nPreço: R$ "+this.preco+
"\nQtde disponível: "+this.qtdeDisp+
"\nQtde vendida: "+this.qtdeVend);
}
}//Produto



public class Principal4 {
public static void main(String args[]){
Scanner teclado=new Scanner(System.in);
Produto p=new Produto("Pendrive 64Gb", 50.80f);
System.out.print("Quantidade a ser reposta: ");
int q=teclado.nextInt();
p.repor(q);
p.exibirDados();
System.out.println("Quantidade a ser vendida: ");
q=teclado.nextInt();
if(p.vender(q))
System.out.println("Venda realizada!");
else System.out.println("Quantidade insuficiente!");
p.exibirDados();
}
}
*/
