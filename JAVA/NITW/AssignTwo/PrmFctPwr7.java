package NITW.AssignTwo;
import java.util.*;
public class PrmFctPwr7 {


    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = str.nextInt(),temp,i;

        int base[]=new int[num+1];
        /* for(i=2;i<=num/2;i++){
            if(num%i!=0 && i!=num){
                base[i]=i;
            }
        } */

        for(i=2;i<=num/2;i++){
            boolean isPrime = true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                base[i] = i;
            }
        }

        int power[]=new int[num+1];
        temp=num;//this makes it more efficient than using it inside loop
        for(i=2;i<=num;i++){
            if(base[i]!=0){
               //temp=num;
                while(temp%base[i]==0){
                    power[i]++;
                    temp/=base[i];
                }
            }
        }
        for (i = 2; i <= num; i++) {
            if (power[i] > 0) {
                System.out.println(base[i] + "^" + power[i]);
            }
        }

    }
}
