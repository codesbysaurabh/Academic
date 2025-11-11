package NITW.AssignOne;
import java.util.*;

public class RailTicketFare6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int  age=sc.nextInt();
        System.out.println("Enter the distance you wish to travel in km : ");
        int dist =sc.nextInt();
        int fullFare=1*dist/2;

        if(age<5){
            System.out.println("No need to pay");
        }
        else if(age>=5&&age<=59){
            System.out.println("Your total fare (in rupees) is : "+fullFare);
        }
        else if(age>=60){
            System.out.println("Your total fare (in rupees) is : "+ (fullFare-(fullFare*40/100)));
        }
        sc.close();
    }
}
