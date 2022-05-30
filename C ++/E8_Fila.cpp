#include <stdio.h>
#include <stdlib.h>

#define TAM 10


void Cria_Fila(int *Inicio, int *Fim)
{
	*Inicio = 0;
	*Fim = 0;
}

int Ins_Fila(int *F, int *Inicio, int *Fim, int v)
{
	if ((*Fim+1)%TAM==*Inicio)
	     return 0;    // Fila está cheia
	else
	{
		*Fim = (*Fim+1)%TAM;
		F[*Fim] = v;
		return 1;
	}
}


int Rem_Fila(int *F, int *Inicio, int *Fim, int *v)
{
	if (*Inicio == *Fim)
	    return 0;     // Fila Vazia
	else
	{
		*Inicio = (*Inicio+1)%TAM;
		*v = F[*Inicio];
		return 1;
	} 
}


void Imprime(int *F, int Inicio, int Fim)
{
	int i = Inicio;
	
	 do 
	 {
		i = (i+1)%TAM;
		printf ("[ %d = %d ]", i, F[i]);
		
	} while (i != Fim);
	
	printf("\n");
}


main()

{
	int F[TAM], Inicio, Fim; 
	int val, op;
	
	Cria_Fila(&Inicio, &Fim); //Criando a Fila Vazia
	
	do 
	{
		system("cls");
		puts("1 - Inserir na Fila");
		puts("2 - Remover da Fila");
		puts("3 - Imprimir a Fila");
		puts("0 - Sair do Programa");
		
		printf("\nDigite a opcao: ");
		scanf("%d", &op);
		switch(op)
		{
			case 1: printf("\nDigite o valor a inserir: ");
			        scanf("%d", &val);
			        if (Ins_Fila(F,&Inicio, &Fim, val))
			            printf("\nInsercao com sucesso!\n");
			        else
			            printf("\nFila Cheia!\n");
			            
			        system("pause");
					break;
					
				
			case 2: if (Rem_Fila(F, &Inicio, &Fim, &val))
			            printf("\nValor removido = %d\n", val);
			        else
			            printf("\nFila Vazia!\n");
			            
			        system("pause");
			        break;
			        
			case 3: if (Inicio == Fim)
			            printf("\nFila VAzia!\n");
			        else
			        {
			        	printf("\nFila:\n");
			        	Imprime(F,Inicio, Fim);
			        	
					}
					system("pause");
					break;
					
			        
			        
			        
			        
			        
			        
			        
		}
		
		
		
		
	} while (op!= 0);


}








