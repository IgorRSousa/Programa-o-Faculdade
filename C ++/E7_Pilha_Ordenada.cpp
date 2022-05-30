// Aluno: Igor Sousa RA: 607568 

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

int Push_Ord(PILHA *p, PILHA *a, int v){
	if (Cheia(p))
		   return 0;
		
	if(Vazia(p)){	
		p->info[++p->topo] = v;
		return 1;
	}else{
		
		while(p->info[p->topo] < v  && !Vazia(p)){
			Push(a, (p->info[p->topo]));
			Pop(p, &(p->info[p->topo]));
		} 
		
		p->info[++p->topo] = v;
		
		while(!Vazia(a)){
			Push(p, (a->info[a->topo]));
			Pop(a, &(a->info[a->topo]));
		} 
		return 1;
	}
}

void Imprime(PILHA p){
	int i;
	for (i=p.topo; i>=0; i--)
	     printf(" [ %d ]\n", p.info[i]);
	
}

main()
{
	PILHA S, Aux;  
	int op, val;
	
	Inicializa(&S);
	Inicializa(&Aux);
	
	do 
	{
		system("cls");
		puts("1 - Inserir na Pilha");
		puts("2 - Remover da Pilha");
		puts("3 - Imprimir a Pilha");
		
		puts("0 - Sair do programa");
		
		printf("\nDigite a opcao: ");
		scanf("%d", &op);
		
		switch(op)
		{
			case 1: 
				printf("\nDigite o valor a inserir: ");
			    scanf("%d", &val);
			    if (Push_Ord(&S, &Aux, val))
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
			        	
							
		}//switch
	} while (op!=0);
}//main
