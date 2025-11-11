package NITW.AssignTwo;
import java.util.*;
public class TowerOfHanoi8 {

    public static void DiskTransfer(int n,String Source,String Helper,String Destination){
        //Base case
        if(n==1){
            System.out.println("Tranfering disk "+n+" from "+Source+" to "+Destination);
            return;
        }

        DiskTransfer(n-1,Source,Destination,Helper);
        System.out.println("Tranferring disk "+n+" from "+Source+" to "+Destination);
        DiskTransfer(n-1,Helper,Source,Destination);

    }
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number of disks : ");
        int n =str.nextInt();
        DiskTransfer(n,"A","B","C");
        
    }
}
