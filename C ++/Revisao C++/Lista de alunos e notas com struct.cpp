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
	if(*f<10){
		L[ *f ] = a;
		(*f)++;
		return 1;
 	}else{
 		return 0;
	}
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

main(){
	No Lista[10];
	
	int fim=0;
	int op, k;
	
	No aluno;
	
	do{
		system("cls");//limpar a tela
		puts("1- Inserir no Fim da lista");
		puts("2- Imprimir a lista");
		puts("3- Inserir na posicao K");
		
		puts("0- Sair da lista");
		
		printf("digite a opcao: ");
		scanf("%d", &op);
		
		switch(op){
			case 1: printf("Digite o nome do aluno: ");
				    fflush(stdin);
				    gets(aluno.nome);
				    printf("Digite a nota 1: ");
				    scanf("%f",&aluno.n1);
				    printf("Digite a nota 2: ");
				    scanf("%f",&aluno.n2);
				    
				    if(ins_fim(Lista, &fim , aluno)){
				    	printf("insercao com sucesso!!");
					}else{
						printf("Lista cheia !!");
					}
				    
				    break;
			
			case 2: if(fim==0){
						printf("Lista Vazia!!");
					}else{
						printf("\nLista:\n");
						imprime(Lista,fim);
	     			}
	     			system("pause");
	     			break;
	     	
			case 3: printf("Digite a posicao a ser inserida: ");
				 	scanf("%d",&k);
				 	
				 	if(k<fim && fim<10){
				 		printf("Digite o nome do aluno: ");
				    	fflush(stdin);
				    	gets(aluno.nome);
				    	printf("Digite a nota 1: ");
				    	scanf("%f",&aluno.n1);
				    	printf("Digite a nota 2: ");
				    	scanf("%f",&aluno.n2);
				    	
				    	ins_pos(Lista, &fim , aluno);//desafio implementar isso
					 }
		}		
	}while(op!=0);
}
