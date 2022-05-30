package Lista1;

/*Desenvolva um programa que leia preço de custo de um produto qualquer, calcule e exiba o preço
de venda sabendo que as percentagens de lucro e de impostos são respectivamente 12% e 26,95%.*/
import java.util.Scanner; //Importando class scanner para leitura
        
public class E1_PerentualDelucro {
    public static void main(String args[]){

        Scanner entrada=new Scanner(System.in);
        float p_custo, p_venda;
        System.out.println("Insira o preço de custo: ");
        p_custo=entrada.nextFloat();
        p_venda=p_custo+(p_custo*0.12f)+(p_custo*0.2695f);
        System.out.println("Preço de venda R$ "+p_venda);
        entrada.close();
    }
}
