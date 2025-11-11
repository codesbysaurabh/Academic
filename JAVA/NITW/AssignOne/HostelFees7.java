package NITW.AssignOne;
import java.util.*;
public class HostelFees7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter your hostel \nEnter 'D' for DASA\nEnter 'O' for OLD\nEnter 'N' for NEW"); 
        char hostel=sc.next().charAt(0);

        System.out.println("Enter the number of days you had taken food : ");
        int foodTaken=sc.nextInt();
        
        int boardingFee=0;

        switch(hostel){
            case 'D':
               boardingFee=500;
               break;
            case 'O':
                boardingFee=800;
                break;
            case 'N':
                boardingFee=300;
                break;
            default:
                System.out.println("Enter a valid choice");

        }
        int messFee=boardingFee*250/100;
        int totalFee=boardingFee+messFee;
        int discount=0;
        if(foodTaken>=28){
            discount=3/100*totalFee;
        }
        else if(foodTaken<28 && foodTaken>=25){
            discount=1/100*totalFee;
        }

        int feesToBePaid=totalFee-discount;

        System.out.println("You need to pay : "+feesToBePaid);

        sc.close();

    }
    
}
