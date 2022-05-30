#include <stdio.h>
#include <stdlib.h>

# define tam 10

typedef struct{
	int info[tam];
	int topo;
}PILHA;

void Inicializa(PILHA *p){
	p->topo = -1;
}

int Cheia(PILHA *p){
	return (p->topo==tam-1);
}

int Vazia(PILHA *p){
	return (p->topo==-1);
}

int Push(PILHA *p, int v){
	if (Cheia(p))
	   return 0;
	   
	p->info[++p->topo] = v;
	return 1;
}

int Pop(PILHA *p, int *v){
	if (Vazia(p))
	    return 0;
	
	*v = p->info[p->topo--];
	return 1;
}

void Imprime(PILHA p){
	int i;
	for (i=p.topo; i>=0; i--)
	     printf(" [ %d ]\n", p.info[i]);
	
}

int Conversao(PILHA *p, int v){
	int b = 0;
	
	while (v > 0){
		Push(p, v%2);
		v /= 2;
	}
	
	while (!Vazia(p)){
		Pop(p, &v);
		b = b*10 + v;
	}
	return b;
}

main()
{
	PILHA S;  
	int op, val, bin;
	
	Inicializa(&S);
	
	do 
	{
		system("cls");
		puts("1 - Inserir na Pilha");
		puts("2 - Remover da Pilha");
		puts("3 - Imprimir a Pilha");
		puts("4 - Converter Decimal para Binario");
		
		puts("0 - Sair do programa");
		
		printf("\nDigite a opcao: ");
		scanf("%d", &op);
		
		switch(op)
		{
			case 1: 
				printf("\nDigite o valor a inserir: ");
			    scanf("%d", &val);
			    if (Push(&S,val))
			        printf("\nInsercao com sucesso!");
			    else
			        printf("\nPilha Cheia!");
			             
				system("pause");
			    break;
			        
			case 2: 
				if (Pop(&S, &val))
			       printf("\nValor removido: %d\n", val);
				else
			       printf("\nPilha Vazia!");
			           
			    system("pause");
			    break;
			        
			case 3: 
				if (Vazia(&S))
			        printf("\nPilha Vazia!\n");
				else{
				    printf("\n PILHA: \n");
				    Imprime(S);
				}
				system("pause");
				break;
			        	
			case 4: 
				printf("\nDigite o valor em decimal: ");
			    scanf("%d", &val);
			        
			    bin = Conversao(&S, val);
					
				printf("\nValor em Binário = %d\n", bin);
				system ("pause");
				break;
							
		}//switch
	} while (op!=0);
}//main





















