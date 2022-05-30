#include<stdio.h>

main(){
	int a[10], i, max=0;
	puts("Digite os elementos do vetor: ");
	
	for(i=0;i<10;i++)
		scanf("%d", & a[i]);
	printf("Vetor: ");
	
	for(i=0;i<10;i++){
		printf("%d ",a[i]);
		if(max<a[i]){
			max=a[i];
		}
	}
  	printf("\nMaior Valor e : %d",max);	
}
