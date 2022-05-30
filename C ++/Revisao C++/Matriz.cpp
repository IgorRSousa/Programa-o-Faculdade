#include <stdio.h>

main(){
	
	int a[5][5], i , j;
	
	puts("Digite os Elementos da matriz: ");
	for(i=0;i<5;i++)
		for(j=0;j<5;j++)
			scanf("%d", & a[i][j]);
	
	printf("Matriz: \n");
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
			printf("%3d", a[i][j]);
		printf("\n");
	}
	
	printf("A diagonal principal: ");
	for(i=0;i<5;i++)
		printf("%d",a[i][i]);
	printf("\n");
	printf("A diagonal Segundaria: ");
	for(i=0 , j=4 ;i<5;i++, j --)
			printf("%d",a[j][i]);
}
