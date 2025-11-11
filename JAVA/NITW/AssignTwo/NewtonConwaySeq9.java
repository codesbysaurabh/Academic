package NITW.AssignTwo;
import java.util.*;
public class NewtonConwaySeq9 {
    
    public static int p(int n) {
        if(n==1||n==2){
            return 1;
        }
        return (p(p(n-1))+p(n-p(n-1)));
    }
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number for Newton-Conway Sequence : ");
        int n =str.nextInt();

       // p(n);

        for(int i=1;i<=n;i++){
        System.out.println("P("+i+") = "+p(i));
        }
    }
}
