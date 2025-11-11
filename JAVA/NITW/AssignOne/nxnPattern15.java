package NITW.AssignOne;
import java.util.*;
public class nxnPattern15 {
    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);
        System.out.print("Enter a number to make pattern for : ");
        //int n = str.nextInt();
        int n=9;
        for(int i=0;i<=n/2;i++){
                for(int j =1;j<=n-5-i;j++){
                    System.out.print(" ");
                }
                for(int j =1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
        }
        for(int i=n/2;i>=0;i--){
                for(int j =1;j<=n-5-i;j++){
                    System.out.print(" ");
                }
                for(int j =1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
        }

        str.close();
    }
}
