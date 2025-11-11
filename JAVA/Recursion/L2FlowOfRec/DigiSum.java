package Recursion.L2FlowOfRec;

public class DigiSum {
    public static void printSum(int sum, int num){
    if(num==0){
            sum+=num%10;
            System.out.println(sum);
            return;
        }
        //there was error when i did num first and sum after 
        printSum(sum+=num%10,num=num/10);
        return;

    }
    public static void main(String[] args) {
        printSum(0,156);
    }
}
