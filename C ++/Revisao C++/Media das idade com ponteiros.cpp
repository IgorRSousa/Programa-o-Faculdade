#include<stdio.h>
#include<stdlib.h>

int *Aloca(int n){
	int *p;
	
	p=(int *)calloc(n,sizeof(int));
	
	return p;
}

void leitura(int *a, int n){
	int i;
	printf("Digite as %d idades: ",n);
	
	for (i=0 ; i<n ; i++){
		scanf("%d",&a[i]);//ou &a[i]== (a+i)
	}
	
}

void imprime(int *a, int n){
	int i ;
	printf("[");
	for(i=0 ; i<n ; i++){
		printf(" %d ",a[i]);
	}
	printf("]\n");
}

float media(int *a, int n){
	int i;
	float m=0;
	for(i=0 ; i<n ; i++){
		m+= a[i];
	}
	return m/n;
}

int mais_velho(int *a, int n){
	
	int i, maior=0;
	
	for(i=0 ; i<n ; i++){
		if(maior<a[i]){
			maior=a[i];
		}
	}
	return maior;

}

main(){
	int *v;//v será minha lista de idades
	int tam, mv;//qtd de idades a serem inseridas
	float med;
	
	printf("Digite a Quantidade de idades: ");
	scanf("%d",&tam);
	
	v= Aloca(tam);
	
	leitura(v, tam);
	
	imprime(v, tam);
	
	med=media(v, tam);
	printf("A media das idades e : %.2f\n", med);
	
	mv = mais_velho(v, tam);
	
	printf("O mais velho entre eles e: %d", mv);
	
}
