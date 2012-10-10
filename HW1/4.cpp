/* Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. 
Да се намерят и изведат всички числа на Фибоначи в интервала [x, y]. */

#include<stdio.h>

int main(){
	
int x=0;
int y=0;

int a=1,b=0,c;

printf("въведи x:");
scanf("%d",&x);
	
printf("въведи y:");
scanf("%d",&y);
	
	
	if(x>y){
		printf("Грешка! Грешно въведени стойности...\n");
		return 1;
	}	
	
	if(x==0){
    	printf("0\n");
    	printf("1\n");
   	}
	
    while(a<=y){
    	c=a;
    	a+=b;
    	b=c;
    	
    		if(a>=x && a<=y){
    			printf("%d\n",a);
    		}
    }
		
	

return 0;
}
