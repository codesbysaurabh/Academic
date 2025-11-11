package Recursion.L2FlowOfRec;

public class CountDigi {
    public static void count(int num ,int terms){
        if(num==0){
            System.out.println(terms);
            return;
        }
        count(num/=10,terms+=1);
        return;

    }
    public static void main(String[] args) {
        count(156,0);
    }
    
}
