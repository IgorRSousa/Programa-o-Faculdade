package Lista1;

import javax.swing.JOptionPane;
public class E9_Troca_a_ultma_pela_primeira_letra{
    public static void main(String args[]){
        int i=0;
        float f;
        double d;

        String numero=JOptionPane.showInputDialog("Digite um número");

        i=Integer.parseInt(numero);//Converte o texto capturado para int
        f=Float.parseFloat(numero);//Converte o texto capturado para float
        d=Double.parseDouble(numero);//Converte o texto capturado para double

        JOptionPane.showMessageDialog(null, "valor int: "+i+"\nvalor float: "+f+"\nvalor double: "+d);

//
}
}
