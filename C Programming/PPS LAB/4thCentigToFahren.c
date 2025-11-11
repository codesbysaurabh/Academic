#include <stdio.h>

int main(){

    float cels, fah;

    printf("Enter temperatue in Centigrades : ");
    scanf("%f", &cels);

    fah = (9*cels/5)+32;

    printf("The temperature in Fahrenheit is %.2f\n", fah);
    
    return 0;
}