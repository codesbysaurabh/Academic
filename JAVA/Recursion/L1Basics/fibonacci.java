package Recursion.L1Basics;

public class fibonacci {
    public static void printNthFibo(int a, int b,int temp,int n,int value) {
        if(n==0){
            System.out.println(value);
            return;
        }
        temp=a;
        a=a+b;
        b=temp;
        printNthFibo(a, b, temp, n-1, value=a);
        return;
    }
    public static void main(String[] args) {
       printNthFibo(0, 1, 0,6 , 0); 
    }
}
