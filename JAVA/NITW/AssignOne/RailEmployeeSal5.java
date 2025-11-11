package NITW.AssignOne;
import java.util.Scanner;

public class RailEmployeeSal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of extra hours you worked in this month : ");
        int xHr=sc.nextInt();

        int totalPay=30*1200;
        int grossPay = totalPay+xHr*100;

        int professionalTax=grossPay*2/100;
        int providentFund=grossPay*10/100;
        int incomeTax=grossPay*5/100;

        System.out.print("Enter number of kids you have : ");
        int kids =sc.nextInt();

        int childEducation=grossPay*kids*2/100;

        int takeHomePay=grossPay-professionalTax-providentFund-incomeTax+childEducation;

        System.out.println("Your Gross Pay for this month is : " + grossPay);
        System.out.println("Your Gross Pay for this month is :" + takeHomePay);

        sc.close();
    }
}
