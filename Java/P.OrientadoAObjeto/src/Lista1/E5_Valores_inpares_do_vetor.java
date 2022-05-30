package Lista1;

/*
 Desenvolva um programa que inicialize um vetor de 10 números inteiros com seguintes números
{5, 7, 9, 11, 6, 4, 8, 16, 13, 1} e exiba os números localizados nas posições ímpares (lembre-se que
num vetor de 10 posições os índices são entre 0 e 9).
 */
public class E5_Valores_inpares_do_vetor {
    public static void main(String args[]){
        int vet[]={5, 7, 9, 11, 6, 4, 8, 16, 13, 1},i;
        System.out.println("Vetor casas impares:");
        for(i=1;i<=9;i+=2){
            System.out.print(vet[i]+" ");
        }
    }
}
