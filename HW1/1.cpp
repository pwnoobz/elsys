/*Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. 
Да се намери сумата на всички нечетни числа в интервала [x,y].*/

#include<stdio.h>
int main(){

    int x=0;
    int y=0;
    int sum=0;
    int i=0;

    printf("въведи x:");
    scanf("%d",&x);

    printf("въведи y:");
    scanf("%d",&y);

    if(x>=y){
        printf("Грешно въведени стойности!\n");
        return(1);
    }

    for(x;x<=y;x++){
        if(x%2!=0){
            sum+=x;
        }
    }
    printf("%d\n",sum);
    return 0;
} 
