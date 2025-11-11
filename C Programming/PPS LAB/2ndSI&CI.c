#include <stdio.h>
#include <math.h>

int main(){

    float principal, rate, time, si,amt;
    double ci;

    printf("Enter principal amount : ");
    scanf("%f", &principal);

    printf("Enter rate of interest : ");
    scanf("%f", &rate);

    printf("Enter time (in years) : ");
    scanf("%f", &time);

    si = principal*rate*time/100;
    amt = principal* pow(1+(rate/100),time);
    ci = amt - principal;
    //ci = (double)pow((double) ci,(double)time);

    //for(int i=1, i <= time, i=i++){
       // ci=ci*ci;}

    printf("Simple interest is %f\n", si);
    printf("Compound interest is %lf\n", ci);
    return 0;
}