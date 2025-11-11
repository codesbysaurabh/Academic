package Recursion.L1Basics;

public class fiboShradhaMam {
    public static void printFactorial(int a, int b, int n) {
        if(n == 0) {
        System.out.println(a);
        return;
        }
        
        printFactorial(b, a+b, n-1);
    }
    public static void main(String args[]) {
    
        printFactorial(0, 1, 5);
    }    
}
