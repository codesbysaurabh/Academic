package NITW.AssignOne;
import java.util.*;
public class armstrongNum11 {
    public static void main(String[] args) {
        
    Scanner str = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num =str.nextInt();
        int armstrongOfNum=0,digi,temp=num;

        while(num>0){
            digi=num%10;
            armstrongOfNum+=digi*digi*digi;
            num/=10;
        }
        num=temp;
        if(num==armstrongOfNum) System.out.println("Entered number is an armstrong number");
        else System.out.println("Entered number is not an armstrong number");

        str.close();

    }
    
}
