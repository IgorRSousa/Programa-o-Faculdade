import javax.swing.JOptionPane;
   
public class Teste_triangulo_e_classificação {
    static String verificaTriangulo(int a, int b, int c){
    if(a<b+c && b<a+c && c<a+b)
        if(a==b && b==c)
            return "Triângulo equilátero";
        else
            if(a==b || a==c || b==c)
                return "Triangulo isósceles";
            else
                return "Triangulo escaleno";
    else
        return "Não forma um triângulo";
}//verificaTriangulo
public static void main(String args[]){
    int x=Integer.parseInt(JOptionPane.showInputDialog("Medida do lado 1"));
    int y=Integer.parseInt(JOptionPane.showInputDialog("Medida do lado 2"));
    int z=Integer.parseInt(JOptionPane.showInputDialog("Medida do lado 3"));
    JOptionPane.showMessageDialog(null, verificaTriangulo(x, y, z));
}
}