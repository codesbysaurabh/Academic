#include <stdio.h>

int main(){

    float r, area, circumference;

    printf("Enter the radius of the circle :");
    scanf("%f", &r);

    area=3.14*r*r;

    circumference=2*3.14*r;

    printf("The area & circumference of the circle is %.2f & %.2f respectively", area, circumference);
    return 0;
}