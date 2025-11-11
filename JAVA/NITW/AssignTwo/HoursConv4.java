package NITW.AssignTwo;
import java.util.*;
public class HoursConv4 {

    public static Scanner str = new Scanner(System.in);
    public static int HH , MM ;
    public static String period="AM";
    public static void input(){
        System.out.print( "Enter the hours : ");
        HH = str.nextInt();
        System.out.print( "Enter the minutes : ");
        MM = str.nextInt();
    }
    public static void conversion(){
        if(HH>12&&HH<24){
            HH-=12;
            period = "PM";
        }
        else if(HH==0){
            HH=12;
        }
    }
    public static void output(){
        if(HH < 0 || HH > 23 || MM < 0 || MM >= 60){
            System.out.println("Enter valid Time ");
        }
        else  System.out.printf("Converted Time = %02d : %02d %s%n", HH, MM, period); //Padding technique like %02d 3 --> 03
       // else System.out.println("Converted Time = "+HH+" : "+MM+" "+period);
    }

    public static void main(String[] args) {
    input();
    conversion();
    output();
    }
    
}
