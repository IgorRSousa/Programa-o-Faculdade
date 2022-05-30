#include<stdio.h>
#include<stdlib.h>

struct dados{
	int info;
	struct dados *prox;
	
};

typedef struct dados NO;

void cria_LSE(NO ** Inicio, NO **Fim){
	*Inicio=NULL;
	*Fim=NULL;
}

void Ins_Inicio(NO ** Inicio, NO **Fim, int val){
	NO *p=(NO *)calloc(1,sizeof(NO));
	
	p->info=val;
	p->prox=*Inicio;
	
	if(*Inicio == NULL){
		*Fim=p;
	}
	*Inicio=p;
}

void Ins_Fim(NO ** Inicio, NO **Fim, int val){
	NO *p=(NO *)calloc(1,sizeof(NO));
	
	p->info=val;
	p->prox=NULL;
	
	if(*Inicio == NULL){
		*Inicio=p;
	}else{
		(*Fim)->prox=p;
	}
	*Fim=p;
}

void Imprime(NO *Inicio){
	NO *p=Inicio;
	while(p != NULL){
		printf("%d-->",p->info);
		p=p->prox;
	}
	printf("NULL\n\n");
}

int Rem_Inicio(NO **Inicio,NO **Fim, int *v){
	NO *p=*Inicio;
	if(p->prox==NULL){
		*v=p->info;
		free(p);
		*Inicio=NULL;
		*Fim=NULL;
	}else{
		*Inicio=p->prox;
		*v=p->info;
		free(p);
	}
	return *v;
}

int Rem_Fim(NO **Inicio,NO **Fim, int *v){
	NO *p=*Inicio;
	NO *q;
	if(p->prox==NULL){
		*v=p->info;
		free(p);
		*Inicio=NULL;
		*Fim=NULL;
	}else{
		while(p->prox!=NULL){
			q=p;
			p=p->prox;
		}
		q->prox=NULL;
		*Fim=q;
		*v=p->info;
		free(p);
	}
	return *v;
}

NO * Consulta(NO *Inicio, int v)
{
	NO *p = Inicio;
	
	while (p!=NULL && p->info!= v)
	   p = p->prox;
	   
	return p;
	
}

void Move_Inicio(NO **Inicio,NO **Fim,NO *r){
	NO *p =  r;
	NO *q = *Inicio;
	
	if (Inicio == NULL){
		printf("\nLista Vazia!\n");
	}else{
		if(p == *Inicio){
			printf("Elemento %d ja esta no inicio !!", r->info);
		}else{
			while(q->prox != p){
				q=q->prox;
			}
			q->prox = p->prox;
			p->prox=*Inicio;
			*Inicio = p;
			printf("\nValor %d movido para o inicio da lista!\n", r->info);
		}
	}
}

void Move_Fim(NO **Inicio,NO **Fim,NO *r){
	NO *p =  r;
	NO *q = *Inicio;
	
	if (*Inicio == NULL){
		printf("\nLista Vazia!\n");
	}else{
		if(p == *Fim){
			printf("Elemento %d ja esta no fim !!", r->info);
		}else{
			while(q->prox != p){
				q=q->prox;
			}
			q->prox = p->prox;
			p->prox=NULL;
			(*Fim)->prox = p;
			printf("\nValor %d movido para o fim da lista!\n", r->info);
		}
	}
}

main(){
	
	NO *Inicio, *Fim, *r;
	int val, op;
	
	cria_LSE(&Inicio, &Fim);
	
	do{
		system("cls");
		puts("1- Inserir no Inicio");
		puts("2- Inserir no Fim");
		puts("3- Imprimir a lista");
		puts("4- Remover no Inicio");
		puts("5- Remover no Fim");
		puts("6- Consutar valor");
		puts("7 - Transferir Valor para o Inicio");
		puts("8 - Transferir valor para o fim");
		
		puts("0- Dead end");
		
		printf("\nDigite opcao que deseja acessar: ");
		scanf("%d", &op);
		
		switch(op){
			case 1:
				printf("\nDigite o valor a inserir: ");
			    scanf("%d", &val);
				Ins_Inicio(&Inicio, &Fim, val);
				break;
			case 2: 
				printf("\nDigite o valor a inserir: ");
			    scanf("%d", &val);
				Ins_Fim(&Inicio, &Fim, val);
				break;
			case 3:
				if (Inicio == NULL){
			        printf("\nLista Vazia!\n");
				}else{
					printf("\nLista:\n");
					Imprime(Inicio);
				}
				system("pause");
				break;
			case 4: 
				if (Inicio == NULL){
			        printf("\nLista Vazia!\n");
				}else{
					Rem_Inicio(&Inicio, &Fim, &val);
					printf("\nElemento %d foi removido do inicio da lista !! \n", val);
				}
				system("pause");
				break;
			case 5:
				if (Inicio == NULL){
			        printf("\nLista Vazia!\n");
				}else{
					Rem_Fim(&Inicio, &Fim, &val);
					printf("\nElemento %d foi removido do fim da lista\n", val);
				}
				system("pause");
				break;
			case 6:
				printf("\nDigite o valor a procurar: ");
			    scanf("%d", &val);
			        
			    r = Consulta(Inicio, val);
			        
			    if (r== NULL)
			        printf("\nValor nao existe na lista!");
			    else
			        printf("\nValor encontrado: %d\n", r->info);
			            
				system("pause");
			    break;
			case 7:
				printf("\nDigite o valor que ira ser movido para o inicio: ");
			    scanf("%d", &val);
			        
			    r = Consulta(Inicio, val);
			    
				if (r== NULL)
			        printf("\nValor nao existe na lista!");
			    else{
			    	Move_Inicio(&Inicio, &Fim, r);
				}    
				system("pause");
			    break;
			case 8:
				printf("\nDigite o valor que ira ser movido para o inicio: ");
			    scanf("%d", &val);
			        
			    r = Consulta(Inicio, val);
			    
				if (r== NULL)
			        printf("\nValor nao existe na lista!");
			    else{
			    	Move_Fim(&Inicio, &Fim, r);
				}    
				system("pause");
			    break;
		}//SWITCH
	}while(op != 0);
}//MAIN
