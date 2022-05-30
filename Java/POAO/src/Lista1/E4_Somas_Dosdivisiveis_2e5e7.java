package Lista1;

/*Desenvolva um programa que some todos os números divisíveis por 2, 5 e 7 ao mesmo tempo de 1
a 1000 e exiba o resultado. */
public class E4_Somas_Dosdivisiveis_2e5e7 {
    public static void main(String args[]){
        int i=1,soma=0;
        System.out.println("Valores: ");
        while(i <=1000){ 
            if((i%2==0) && (i%5==0) && (i%7==0)) {
                 System.out.println(i);
                 soma+=i;
             }
            i++;
        }
        System.out.println("Soma: "+ soma);
    }
}
