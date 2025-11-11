package NITW.AssignOne;
import java.util.*;
public class strongNum10 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num =str.nextInt();
        int strongOfNum=0,digi,i,temp=num;

        while(num>0){
            digi=num%10;
            int digiFacto=1;
            for(i=digi;i>0;i--) digiFacto*=i;
            strongOfNum+=digiFacto;
            num/=10;
        }
        num=temp;
        if(num==strongOfNum) System.out.println("Entered number is a strong number");
        else System.out.println("Entered number is not a strong number");

        str.close();
    }
}
