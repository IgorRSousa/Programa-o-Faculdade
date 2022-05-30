#include <stdio.h>

main (){
	int a,b,c;
	
	printf("Jogador A: ");
	scanf("%d", &a);
	printf("Jogador B: ");
	scanf("%d", &b);
	printf("Jogador C: ");
	scanf("%d", &c);
	
	if((a==b) && (b==c)){
		printf("!!Impate!!");
	}else{
		if((a!=b) && (a!=c)){
			printf("Jogador A venceu");
		}else{
			if(b!=a){
				printf("Jogador B venceu");
			}else{
				printf("Jogador C venceu");
			}
		}
	}
}
