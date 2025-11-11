package Recursion.L1Basics;

public class SumN {
    public static void printSum(int num,int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }

        printSum(num-1,sum+=num);
    }
    public static void main(String[] args) {
        
        printSum(5,0);
    }
}
