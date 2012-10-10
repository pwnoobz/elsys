/*Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. Да се намерят и изведат всички прости числа завършващи на 3 в интервал [x,y].*/

#include<stdio.h>

void korenuvane(int p){
	int koren;
	int k;
	
	for(k;k<p;k++){
		koren*=7;
	}
	
	if((koren-7)%p==0){
		printf("%d\n",p);
		printf("%d\n",koren);
	}
}


int main(){
	
int x=0;
int y=0;

printf("въведи x:");
scanf("%d",&x);
	
printf("въведи y:");
scanf("%d",&y);
	
	
	if(x>y){
		printf("Грешкаr! Грешно въведени стойности...\n");
		return 1;
	}
	
	for(x;x<=y;x++){
		if(x%10==3){
			//Ако p е просто и a е произволно цяло число, то ap − a се дели на p (малка теорема на Ферма).
			korenuvane(x);			
		}
	}
	

return 0;
}