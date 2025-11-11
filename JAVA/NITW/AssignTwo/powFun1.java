package NITW.AssignTwo;
import java.util.*;
public class powFun1 {
    Scanner str = new Scanner(System.in);
    public static int result =1;
    public static int pow(int base , int power){
        if(power == 0){
            return result;
        }
        result*=base;
        return pow(base, power-1);
    }
    
    public static void main(String[] args) {
        System.out.println(pow(46, 5));
    }
}
