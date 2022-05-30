package Lista1;

/*Desenvolva um programa que exiba todos os números divisíveis por 3 e 4 entre 1 a 1000.*/

public class E3_N_Divisiveis_p_3e4 {
    public static void main(String args[]){
        int i=1;
        System.out.println("Valores: ");
        while(i <=1000){ 
            if((i%3==0) && (i%4==0)){
                 System.out.println(i);
             }
            i++;
        }
    }
}

