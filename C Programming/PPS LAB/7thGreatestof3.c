#include <stdio.h>

int main(){

    float num1, num2, num3, num4;

    printf("Enter first number : ");
    scanf("%f", &num1);

    printf("Enter second number : ");
    scanf("%f", &num2);

    printf("Enter third number : ");
    scanf("%f", &num3);

    if (num1>=num2 && num1>=num3)
        num4=num1;

    else
        if (num2>=num3)
            num4=num2;

        else
            num4=num3;
            
    printf("The greatest of the three numbers is %f", num4);

    return 0;
}