package Lista1;

import java.util.Scanner;

public class E2_Imc_m_f {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        String sexo;
        float altura,peso_ideal;
        
        System.out.println("Informe m ou f onde m=Masculino e f=Feminino: ");
        sexo=teclado.next();
        System.out.println("Informe sua Altura: ");
        altura=teclado.nextFloat();
        if(sexo.equals("m"))
            peso_ideal=(72.7f*altura)-58;
        else
            peso_ideal=(62.1f*altura)-44.7f;
        System.out.println("Peso ideal: "+peso_ideal);
        teclado.close();
    }
}
