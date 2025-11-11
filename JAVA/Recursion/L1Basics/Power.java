package Recursion.L1Basics;

public class Power {
    public static void printPow(int base , int pow , int value) {
        if(pow==0){
            System.out.println(value);
            return;
        }
        printPow(base, pow-1, value*=base);
        return;
    }
    public static void main(String[] args) {
        printPow(3, 2, 1);
    }
    
}
