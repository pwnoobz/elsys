/* �� �� ��������� ��������, ����� ������� �� ����������� �� ������ ��� ����������� �����, x � y, ������ x < y. 
�� �� ������� � ������� ������ ����� �� �������� � ��������� [x, y]. */

#include<stdio.h>

int main(){
	
int x=0;
int y=0;

int a=1,b=0,c;

printf("������ x:");
scanf("%d",&x);
	
printf("������ y:");
scanf("%d",&y);
	
	
	if(x>y){
		printf("������! ������ �������� ���������...\n");
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
