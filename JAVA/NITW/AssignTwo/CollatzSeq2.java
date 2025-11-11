package NITW.AssignTwo;
import java.util.*;
public class CollatzSeq2 {

    public static int steps=0;
    public static int countSteps(int num) {
        
        while(num!=1){
        if(num%2==0) num/=2;
        else num=(num*3)+1;
        steps+=1;
        }
        return steps;
    }
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = str.nextInt();

        System.out.println(countSteps(num));
        str.close();
    }
}
