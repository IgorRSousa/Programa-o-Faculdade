#include <stdio.h>

main(){
	char letra;
	do{
		puts("Digite uma letra ou(z) para encerrar: ");
		fflush(stdin);
		scanf("%c", & letra);
		if(letra!= 'z')
			printf("Letra = %c\n",letra);
	}while(letra!='z');
}

