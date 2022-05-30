/*public class leMatriz {
    static int [][] leMatriz(){
        int m[][] = new int[3][3];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                m[i][j]=(int)(Math.random()*10+1);
                System.out.print("\t"+m[i][j]);
            }
        System.out.println();
        }//for
        return m;
}

static void leMatriz(int m[][]){
    for(int i=0; i<m.length; i++){
        for(int j=0; j<m[0].length; j++){
        m[i][j]=1+(int)(Math.random()*10);//gera um numero aleatorio ...'N de inicio da faixa'+(int)(Math.random()*fim da faixa)
        System.out.print("\t"+m[i][j]);//print da linha da matriz 
    }
    System.out.println();//pular linha 
    }//for
}


static int soma(int mat[][]){
    int soma=0;
        for(int i=0; i<mat.length; i++)
            for(int j=0; j<mat[0].length; j++)
            soma+=mat[i][j];
    return soma;
    }//soma

public static void main(String args[]){
    //int x[][]=leMatriz();

    int x[][]=new int[3][3];
    leMatriz(x);
    System.out.println("Soma = "+soma(x));
    }
    }//Exercicio11*/