#include <stdio.h>

int main(){

    float num1, num2;

    printf("Enter a number : ");
    scanf("%f", &num1);

    printf("Enter another number : ");
    scanf("%f", &num2);

    if(num1==num2)
        printf("The two numbers are equal");

    else
        printf("The two numbers are not equal");  

    return 0;
}