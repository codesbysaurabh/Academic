//random fuction is used here

package NITW.AssignTwo;
//import java.util.Random;
public class coinToss3 {
    public static void main(String[] args) {
        int heads=0,tails=0,NumOfTosses = 100;
        while(NumOfTosses!=0){
            if(Math.random()<0.5) heads++;
            else tails++;
            NumOfTosses--;
        }

        System.out.println("Total Heads : "+heads+"\nTotal Tails : "+tails);
    }
    
}
