package Recursion.L1Basics;
//import java.util.*;
public class OneToN {
    public static int printNum (int num){
       if(num==0){
        return 0;
       }
        System.out.println(num);
        printNum(num-1);
        System.out.println(num);
        return 1;
    }
    public static void main(String[] args) {
    printNum(8);
    } 
}
