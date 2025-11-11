package NITW.AssignOne;
import java.util.*;
public class nonPrimeProd12 {
    public static boolean isPrime(int j) {
        if (j <= 1) return false; // 0 and 1 are not prime
        for(int i=2;i<=j/2;i++) //i did i=1 which had logical error as every number is divisble by 1  as such it would return false every time
            if(j%i==0) return false;
        return true;   
    }
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = str.nextInt();
        int result=1;

        for(int j =1;j<=num;j++) {

            if(isPrime(j)) continue;
            result*=j;
        }
        System.out.println("Product of all non prime integers from 1 to "+num+" is "+result);
        str.close();

    }
}
