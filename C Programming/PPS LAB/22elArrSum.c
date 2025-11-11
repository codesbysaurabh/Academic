#include <stdio.h>

int main(){

    int size,sum=0;
    printf("Enter the array length : ");
    scanf("%d",&size);
    int arr[size];
    printf("Enter elements of array : \n");
    for(int i = 0; i < size; i++)
    {
        scanf("%d",&arr[i]);
        sum+=arr[i];
    }
    printf("Sum of all array elements is %d",sum);
}