// Nome: Igor Sousa  RA: 607568

#include <stdio.h>
#include <stdlib.h>

struct dados{
	struct dados *esq;
	int info;
	struct dados *dir;
};

typedef struct dados NO;

void Cria_LDE(NO **Inicio, NO **Fim){
	*Inicio = NULL;
	*Fim  = NULL;
}


void Ins_Inicio(NO **Inicio, NO **Fim, int v){
	NO *p = (NO *)calloc(1, sizeof(NO));
	
	p->info = v;
	p->esq = NULL;
	p->dir = *Inicio;
	
	if (*Inicio==NULL)
	    *Fim = p;
	else
	    (*Inicio)->esq = p;
	    
	
	*Inicio = p;
}

void Ins_Fim(NO **Inicio, NO **Fim, int v){
	NO *p = (NO *)calloc(1, sizeof(NO));
	
	p->info = v;
	p->dir = NULL;
	p->esq = *Fim;
	
	if (*Fim==NULL)
	     *Inicio = p;
	else
	    (*Fim)->dir = p;
	    
	*Fim = p;
	
}

void Imprime(NO *Inicio){
	NO *p = Inicio;
	printf("\nNULL");
	
	while (p!=NULL)
	{
		printf("<--%d-->", p->info);
		p = p->dir;
	}
	printf("NULL\n\n");
}

void Rem_Inicio(NO **Inicio, NO **Fim, int *v){
	NO *p = *Inicio;
	*v = p->info;
	*Inicio = p->dir;  
	
	if (*Inicio== NULL)
	     *Fim = NULL;
	else
	    (*Inicio)->esq = NULL;
	    
	free(p);
}

void Rem_Fim(NO **Inicio, NO **Fim, int *v){
	NO *p = *Fim;
	*v = p->info;
	*Fim = p->esq;   
	
	if (*Fim==NULL)
	    *Inicio = NULL;
	else
	    (*Fim)->dir = NULL;
	    
	free(p);
	
}


NO * Consulta(NO *Inicio, int v){
	NO *p = Inicio;
	
	while (p!=NULL && p->info != v)
	   p = p->dir;
	   
    return p;	   

	
}


void Ins_Depois(NO *r, int v){
	NO *p = (NO*) calloc(1, sizeof(NO));
	NO *q = r->dir;
	
	p->info = v;
	
	p->esq = r;
	p->dir = q;
	
	r->dir = p;
	q->esq = p;
	
}

void Rem_Meio(NO *r){
	NO *p = r->esq;
	NO *q = r->dir;
	
	p->dir = q;
	q->esq = p;	
		
	free(r);
}

void Rem_Repetidos(NO **Inicio, NO **Fim){
	NO *p = *Inicio;
	NO *q = *Inicio;
	NO *i = *Inicio;
	NO *f = *Fim;
	NO *r;
	int v;
	q = q->dir;
	
	while(p->dir != NULL)
	{
		v = p->info;
		
		while(q != NULL){
			
			if(v == q->info){
				
				r = Consulta(i, v);
				if (r==NULL){
			    }else{
			       	if (r == i){
					   Rem_Inicio(&i, &f, &v);
					}else{
					   if (r == f){
					      Rem_Fim(&i, &f, &v);
					  	}else{
					      Rem_Meio(r);
					  }
					}
				}
			}
			q = q->dir;
		}
		p = p->dir;
		q = p->dir;
	}
	*Inicio = i;
	*Fim = f;
}

void Resta_Um(NO **Inicio, NO **Fim, NO **N){
	NO *p = *N;
	NO *r;
	int cb;
	
	while(*Inicio != *Fim){
		if(p == *Inicio){
			r = p->dir;
			Rem_Inicio(&*Inicio, &*Fim, &cb);	
		}else{
			if(p == *Fim){
				r = *Inicio;
				Rem_Fim(&*Inicio, &*Fim, &cb);
			}else{
				r = p->dir;
				Rem_Meio(p);
			}
		}
		
		if(r == *Fim){
			p= *Inicio;
		}else{
			p = r->dir;
		}
		NO *i=*Inicio;
		Imprime(i);
	}
}



main()
{
	NO *Inicio, *Fim, *r;
	int val, op;
	
	Cria_LDE(&Inicio, &Fim);
	
	do
	{
		system("cls");
		puts("1 - Inserir no Inicio");
		puts("2 - Inserir no Fim");
		puts("3 - Imprimir a Lista");
		puts("4 - Remover no Inicio");
		puts("5 - Remover no Fim");
		puts("6 - Consultar um Valor");
		puts("7 - Inserir depois de Valor");
		puts("8 - Remover um valor");
		puts("9 - Remover repetidos");
		puts("10 - Resta UM");
		
		puts("0 - Sair do programa");
		
		printf("\nDigite a opcao: ");
		scanf("%d", &op);
		
		switch(op)
		{
			case 1: printf("\nDigite o valor a inserir: ");
			        scanf("%d", &val);
			        Ins_Inicio(&Inicio, &Fim, val);
			        break;
			        
			case 2: printf("\nDigite o valor a inserir: ");
			        scanf("%d", &val);
			        Ins_Fim(&Inicio, &Fim, val);
			        break;
			        
			case 3: if (Inicio == NULL)
			            printf("\nLista Vazia!\n");
			        else
			        {
			        	printf("\nLista:\n\n");
			        	Imprime(Inicio);
					}
					system("pause");
					break;
					
			case 4: if (Inicio == NULL)
			             printf("\nLista Vazia!\n");
			        else
			        {     
			            Rem_Inicio(&Inicio, &Fim, &val);
			            printf("\nFoi removido o valor: %d\n", val);
			        }
			        system("pause");
			        break;
	
			case 5: if (Inicio == NULL)
			             printf("\nLista Vazia!\n");
			        else
			        {     
			            Rem_Fim(&Inicio, &Fim, &val);
			            printf("\nFoi removido o valor: %d\n", val);
			        }
			        system("pause");
			        break;
			        
			case 6: printf("\nDigite o valor a procurar:");
			        scanf("%d", &val);
			        
			        r = Consulta(Inicio, val);
			        
			        if (r==NULL)
			            printf("\nValor nao existe na lista!\n");
			        else
			            printf("\nValor encontrado: %d\n", r->info);
			            
			        system("pause");
			            
			        break;
			        
			        
			case 7: printf("\nDigite o valor a procurar:");
			        scanf("%d", &val);
			        
			        r = Consulta(Inicio, val);
			        
			        printf("\nDigite o valor a inserir: ");
			        scanf("%d", &val);
			        
			        if (r==NULL || r==Fim)
			            Ins_Fim(&Inicio, &Fim, val);
			        else
			         	Ins_Depois(r, val);
			         	
			        break;
			        
			case 8:
				printf("\nDigite o valor a remover:");
			    scanf("%d", &val);
			        
			    r = Consulta(Inicio, val);
			        
			    if (r==NULL)
			        printf("\nValor não existe na lista!");
			    else
			        {
			        if (r==Inicio)
					   Rem_Inicio(&Inicio, &Fim, &val);
					else
					   if (r==Fim)
					      Rem_Fim(&Inicio, &Fim, &val);
					   else
					      Rem_Meio(r);
						  
					printf("\nRemocao com sucesso!");
				}
			    system("pause");
			    break;
			case 9:
				if (Inicio == NULL)
			        printf("\nLista Vazia!\n");
			    else
			    {     
			        Rem_Repetidos(&Inicio, &Fim);
			        printf("\nValores repitidos foram removidos !! \n");
			    }
			    system("pause");
			    break;
			case 10:
				if (Inicio == NULL)
			        printf("\nLista Vazia!\n");
			    else
			    {     
			        printf("Infome o elemento da lista que deve comecar a fucao: ");
			        scanf("%d", &val);
			        
			        r = Consulta(Inicio, val);
			        
			        if (r==NULL)
			            printf("\nValor informado nao existe na lista!\n");
			        else{
						Resta_Um(&Inicio, &Fim, &r);
						printf("\n!! Funcao executada com sucesso !!\n\n"); 					
					}       
			    }
			    system("pause");   
				break;	    
		}
		
		
	} while (op!=0);
}




