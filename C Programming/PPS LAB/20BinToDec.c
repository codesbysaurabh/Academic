#include <stdio.h>

int main(){

    int binary,decimal=0,i,temp,digit;
    printf("Enter the Binary you wish to convert : ");
    scanf("%d",&binary);

    temp=binary,i=1;
    while(temp){
        digit=temp%10;
        decimal+=digit*i;
        i*=2;
        temp/=10;
    }

    printf("Decimal of %d is %d",binary,decimal);
}