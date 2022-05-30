#include <stdio.h>

void calcula(int x, int *y, int *z){
	*y=x-1;
	*z=x+1;
}


main(){
	int num, ant, suc;
	
	printf("Insira um valor:\n");
	scanf("%d", & num);
	
	calcula(num, &ant, &suc);
	
	printf("\nO antecessor do %d -> %d", num, ant);
	printf("\nO sucessor do %d -> %d", num, suc);
}
