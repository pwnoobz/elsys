/*�� �� ��������� ��������, ����� ������� �� ����������� �� ������ ��� ����������� �����, x � y, ������ x < y. 
�� �� ������ ������ �� ������ ������� ����� � ��������� [x,y].*/

#include<stdio.h>
int main(){

    int x=0;
    int y=0;
    int sum=0;
    int i=0;

    printf("������ x:");
    scanf("%d",&x);

    printf("������ y:");
    scanf("%d",&y);

    if(x>=y){
        printf("������ �������� ���������!\n");
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
