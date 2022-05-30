#include<stdio.h>

int valor, divisor=1,dvalor;

main(){
	
	printf("Insira O valor que deseja saber seus divisores: ");
	scanf("%d", & valor);
	
	while(divisor <= valor/2){
		if(valor%divisor==0){
			printf("%d\n",divisor);
		}
		divisor++;
	}
}
