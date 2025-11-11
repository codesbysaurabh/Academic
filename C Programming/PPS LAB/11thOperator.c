#include <stdio.h>

int main(){

    float num1, num2;
    printf("Enter a number :");
    scanf("%f",&num1);
    printf("Enter another number :");
    scanf("%f",&num2);

    char operator;
    printf("Enter Operator like + - * / ");
    scanf(" %c",&operator);

    switch (operator){
        case'+':
        printf( "%f",num1+num2);
        break;
        case'-':
        printf( "%f",num1-num2);
        break;
        case'*':
        printf( "%f",num1*num2);
        break;
        case'/':
        printf( "%f",num1/num2);
        break;
    }
}