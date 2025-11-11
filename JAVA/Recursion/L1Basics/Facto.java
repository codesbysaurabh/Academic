package Recursion.L1Basics;

public class Facto {
    public static void printFacto(int num,int facto){
        if(num==0){
            System.out.println(facto);
            return;
        }
        printFacto(num-1, facto*=num);
        return;
    }
    public static void main(String[] args) {
        printFacto(5, 1);
    }
}
