package NITW.AssignOne;
import java.util.*;
public class LibraryFine4 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days you are late to return book : ");
        int due =sc.nextInt();

        if(due<7){
            System.out.println("You have to pay a fine of one rupee ");
        }
        else if(due>=7&&due<=14){
            System.out.println("You have to pay a fine of two rupees ");
        }
        else if(due>14&&due<=30){
            System.out.println("You have to pay a fine of five rupees ");
        }
        else if(due>30){
            System.out.println("Your membership has been cancelled ");
        }
        
        

        sc.close();
       }
    }