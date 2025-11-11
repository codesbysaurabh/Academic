package NITW.AssignOne;
import java.util.*;
public class countPNZ9 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int positives=0,negatives=0,zeros=0,control=1,num;

        while(control>0){
            System.out.println("Enter the number : ");
            num=str.nextInt();

            if(num>0){
                positives++;
            }
            else if(num<0){
                negatives++;
            }
            else{
                zeros++;
            }
            System.out.println("Enter 1 to continue and 0 to end ");
            control=str.nextInt();
        }
        System.out.println("Total Positive numbers are "+positives);
        System.out.println("Total Negative numbers are "+negatives);
        System.out.println("Total  Zeros are "+zeros);

        str.close(); 
    }
}
