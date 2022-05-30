#include <stdio.h>

struct dados 
{
	char nome[30];
	int idade;
};

typedef dados PESSOA;

void leia(PESSOA *v, int tam)
{
	int i;
	for (i=0; i<tam; i++)
	{
	     printf("\nNome....: ");
	     fflush(stdin);
	     gets(v[i].nome);
	     printf("Idade...: ");
	     scanf("%d", &v[i].idade);
	}
	
}

void imprime(PESSOA *v, int tam)
{
	int i;
	for (i=0; i<tam; i++)
	{
		printf("\nNome...: %s", v[i].nome);
		printf("\nIdade..: %d\n",v[i].idade);
		
	}
}

int mais_velho(PESSOA *v, int tam)
{
	int i, m_velho=0 ,p;
	for (i=0; i<tam; i++)
	{
		if(v[i].idade >= m_velho){
			m_velho = v[i].idade;
			p=i;
		}
		
	}
	return p;
}
main(){
	PESSOA a[5];
	int pos;
	
	leia(a,5);
	printf("------------------------------------");
	imprime(a,5);
	printf("------------------------------------");
	
	pos = mais_velho(a,5);
	
	printf("\nNome do mais velho.: %s", a[pos].nome);
	printf("\nIdade do mais velho: %d\n", a[pos].idade);
}
