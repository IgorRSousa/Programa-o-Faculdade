#include <stdio.h>
#include <stdlib.h>

struct dados 
{
	char nome[30];
	float n1;
	float n2;
};

typedef dados No;


int ins_fim(No *L, int *f, No a)
{
	if (*f < 10) 
	{
		L[ *f ] = a;
	    (*f)++;         // *f += 1
	    return 1;
    }
    else
        return 0;
}

void ins_pos(No *L, int *f, int k, No a)
{
	int i;
	
	// livrando a posição K para o novo aluno
	for (i=*f; i>k; i--)
		L[i] = L[i-1];//muito inteligente
	
	L[k] = a;
	
	(*f)++;
		
}


void imprime(No *L, int f)
{
	int i;
	
	for (i=0; i<f; i++)
	{
		printf("\nNome....: %s", L[i].nome);
		printf("\nNota 1..: %.2f", L[i].n1);
		printf("\nNota 2..: %.2f\n", L[i].n2);
	}
}

void rem_fim(No *L, int *f)
{
	printf("Aluno a ser removido\n");
	printf("Nome: %s\n", L[(*f)-1].nome);
	
	(*f)--;
	
}


void rem_pos(No *Lista, int *fim, int k)
{
	int i;
	
	printf("Aluno a ser removido: %s\n",Lista[k].nome);
	
	for (i=k; i< (*fim); i++)
	    Lista[i] = Lista[i+1];
	    
	(*fim)--;
}
	    

main()
{
	No Lista[10]; // criando uma lista capaz de armazenar
	              // 10 nós --> 10 alunos
	              
	int fim = 0; // fim --> controla o fim da lista
	int op, k;
	
	No aluno;
	
	do 
	{
		system("cls"); // limpa a tela
		puts("1 - Inserir no Fim da Lista");
		puts("2 - Imprimir a Lista");
		puts("3 - Inserir na posição K");
		puts("4 - Remover no fim");
		puts("5 - Remover na posição K");
		
		puts("0 - Sair do programa!");
		
		printf("Digite a opcao: ");
		scanf("%d", &op);
		
		switch(op)
		{
			case 1: printf("Digite o nome do aluno: ");
			        fflush(stdin);
					gets(aluno.nome);
					printf("Digite a nota 1:");
					scanf("%f", &aluno.n1);
					printf("Digite a nota 2:");
					scanf("%f", &aluno.n2);
					
					if (ins_fim(Lista, &fim, aluno))
					    printf("Insercao com sucesso!");
					else
					    printf("Lista cheia!");
					
					break;
					 
			
			case 2: if (fim == 0)
			            printf("Lista Vazia!");
			        else
			        {
			        	printf("\nLista:\n");
			        	imprime(Lista, fim);
			        	
					}
					system("pause");
					break;
					
			case 3: printf("Digite a posicao onde ira inserir:");
			        scanf("%d", &k);
			     
			        if (k>=0 && k<fim && fim < 10)//testa se k sugerido esta entre o inicio e fim da lista e se a propria n esta cheia
					{
					   printf("Digite o nome do aluno: ");
			           fflush(stdin);
					   gets(aluno.nome);
					   printf("Digite a nota 1:");
					   scanf("%f", &aluno.n1);
					   printf("Digite a nota 2:");
					   scanf("%f", &aluno.n2);
						
					   ins_pos(Lista, &fim, k, aluno);
					    
					
					}  
					else
					   printf("Posicao invalida!");
					   
					break;
			     
			     
			     
			case 4: if (fim>0)
			            rem_fim(Lista, &fim);
			        else
			            printf("Lista Vazia!");
	
	                system("pause");		        
			        break;
			        
			case 5: printf("\nDigite a posicao do aluno a ser removido:");
			        scanf("%d", &k);
			        
			        if (k>=0 && k<fim && fim >0)
			             rem_pos(Lista, &fim, k);
			        else
			           printf("\nPosicao invalida ou lista Vazia!");
			        
			        system("pause");
			        break;
			        
			        
			
			
		
		}
		
	} while (op!=0);
}
