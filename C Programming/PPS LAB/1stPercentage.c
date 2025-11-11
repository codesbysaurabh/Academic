#include <stdio.h>
int main(){
    
    float maxx, s1, s2, s3, s4, s5, sum, percent;

    printf("Enter maximum marks for each subject: ");
    scanf("%f", &maxx);
    
    printf("Enter marks of subject 1: ");
    scanf("%f", &s1);

    printf("Enter marks of subject 2: ");
    scanf("%f", &s2);

    printf("Enter marks of subject 3: ");
    scanf("%f", &s3);

    printf("Enter marks of subject 4: ");
    scanf("%f", &s4);

    printf("Enter marks of subject 5: ");
    scanf("%f", &s5);

    sum=s1+s2+s3+s4+s5;

    percent=sum*100/(maxx*5);

    printf("Student's total score is %.2f\n", sum);

    printf("Percentage obtained is %.2f\n", percent);

    return 0;
}