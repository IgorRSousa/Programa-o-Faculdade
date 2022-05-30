#include <stdio.h>
#include <stdlib.h>

struct no_arvore {
	struct no_arvore *esq;
	int info;
	struct no_arvore *dir;

};

typedef struct no_arvore ARVORE;

ARVORE *CAPB (int N)
{
	ARVORE *r;
	if (N==0)
	   	r=NULL;
	else
	{
	  	r = (ARVORE *) calloc (1, sizeof(ARVORE));
		printf("\nDigite um valor => ");
		scanf("%i",&r->info);
	   	r->esq = CAPB(N/2);
	   	r->dir = CAPB(N - N/2 - 1);
	}
	return r;
}

void Imprime(ARVORE *R)
{
	if (R != NULL)
	{
		Imprime (R->esq);
		printf ("%i  ",R->info);
		Imprime (R->dir);
	}
}


main()
{
	
	// 10  8  5   9  20  15  25
	
	ARVORE *Raiz;
	
	int N;
	
	printf("Digite a qtd de nos de arvore: ");
	scanf("%d", &N);
	
	Raiz = CAPB(N);
	
	printf(" \nArvore:\n");
	
	Imprime (Raiz);
	
}
