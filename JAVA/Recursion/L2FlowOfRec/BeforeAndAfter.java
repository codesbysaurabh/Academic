package Recursion.L2FlowOfRec;

public class BeforeAndAfter {
    public static void printTriangle(int n){
        if(n==0){ 
            return;
        }
        for(int i =0;i<n;i++)
        {System.out.print("*");}
        
        System.out.println();

        printTriangle(n-1);

        for(int i =0;i<n;i++)
        {System.out.print("*");}

        System.out.println();

        return;
    }
    public static void main(String[] args) {
        printTriangle(3);
    }
    
}
