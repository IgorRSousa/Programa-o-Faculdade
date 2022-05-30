#include <stdio.h>
/*
main(){
	int a, b ;
	
	for(a=1,b=2; a+b<=20 ; a++, b+=2){
		printf("A=%d  B=%d A+B=%d \n",a,b,a+b);
	}
}*/
main(){
	int soma=0;
	
	for(int cont=1; cont<=100 ; soma += cont , cont++);
		printf("Soma = %d \n",soma);
	
}
