package NITW.AssignOne;
import java.util.*;
public class CheckTrinagle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three sides of traingle : ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        if(s1==s2 && s1==s3){
            System.out.println("For given sides "+s1+" , "+s2+" and "+s3+" : triangle is Equilateral ");
        }
         else if(s1*s1+s2*s2==s3*s3 || s3*s3+s2*s2==s1*s1 || s1*s1+s3*s3==s2*s2){
            System.out.println("For given sides "+s1+" , "+s2+" and "+s3+" : triangle is Right Angled ");
         }
        else {
            if(s1==s2 || s1 ==s3){
                System.out.println("For given sides "+s1+" , "+s2+" and "+s3+" : triangle is Isosceles ");
            }
            else{
                System.out.println("For given sides "+s1+" , "+s2+" and "+s3+" : triangle is Scalene ");
            }
        }

    sc.close();
    } 
    
}
