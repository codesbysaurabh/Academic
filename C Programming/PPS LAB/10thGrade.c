#include <stdio.h>

int main(){

    float sub1,sub2,sub3,sub4,sub5;
    printf("Enter Marks of Subject 1 : ");
    scanf("%f",&sub1);
    printf("Enter Marks of Subject 2 : ");
    scanf("%f",&sub2);
    printf("Enter Marks of Subject 3 : ");
    scanf("%f",&sub3);
    printf("Enter Marks of Subject 4 : ");
    scanf("%f",&sub4);
    printf("Enter Marks of Subject 5 : ");
    scanf("%f",&sub5);
    
    float total,percentage;

    total=sub1+sub2+sub3+sub4+sub5;
    percentage=(total/500)*100;

    printf("Your Percentage is %f\n",percentage);
    if(percentage>=90 && percentage<=100){
        printf("Your Grade is A");
    }
    if(percentage>=80 && percentage<90){
        printf("Your Grade is B");
    }
    if(percentage>=60 && percentage<80){
        printf("Your Grade is C");
    }
    else{
        printf("Your Grade is D");
    }
}