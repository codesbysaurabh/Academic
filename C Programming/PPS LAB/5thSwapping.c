#include <stdio.h>

int main(){

    float num1, num2, num3;

    printf("Enter first number num1 : ");
    scanf("%f", &num1);

    printf("Enter second number num2 : ");
    scanf("%f", &num2);

    num3=num1;
    num1=num2;
    num2=num3;

    printf("After swapping, we have\n");
    printf("num1 = %f\n", num1);
    printf("num2 = %f\n", num2);

    return 0;
}
