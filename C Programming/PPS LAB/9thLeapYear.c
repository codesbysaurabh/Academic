#include <stdio.h>

int main(){

    int year;
    printf("enter your year : ");
    scanf("%d",&year);

    if(year%4==0 && year%100!=0 || year%400==0){
        printf("Year %d is Leap Year  ",year);
    }else {
        printf("Year %d is not Leap Year  ",year);
    }
}