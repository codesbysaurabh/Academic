package Recursion.L2FlowOfRec;

public class CountRecur {
    public static void count(int n){
        if(n==0){
            return;
        }
        System.out.println("Before : "+n);
        count(n-1);
        System.out.println("After : "+n);
    }
    public static void main(String[] args) {
        count(5);
    }
}
