package Lista1;

import java.util.Scanner;

public class E6_Matriz_4x4 {
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        int m[][]=new int[4][4], soma=0;
            for(int i=0; i<4; i++)
                for(int j=0; j<4; j++){
                    //System.out.print("Digite um nro ["+i+" ,"+j+"]= ");
                    m[i][j]= ((int)(Math.random()*10 +1)); //teclado.nextInt();
                    System.out.println("Digite um nro ["+i+" ,"+j+"]= "+m[i][j]);
                }//for
        System.out.println("\n");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("\t"+m[i][j]);
            }
            System.out.println();
        }
        for(int i=0; i<4; i++)
            soma+=m[i][i];
        System.out.println("Soma = "+soma);
        teclado.close();
    }//main
}




