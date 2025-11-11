#include <stdio.h>

int main(){

    int length,ans;
    printf("Enter the length : ");
    scanf("%d",&length);

    for (int i = 1; i <= length; i++)
    {
        for (int j = 1; j <= length-i; j++)
        {
            printf(" ");
        }
        ans=1;
        for (int j = 1; j <= i; j++)
        {
            printf("%d ",ans);
            ans=ans*(i-j);
            ans=ans/j;
        }
        printf("\n");
        
    }
}