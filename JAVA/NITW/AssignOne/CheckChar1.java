package NITW.AssignOne;
import java.util.*;
public class CheckChar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        if(ch<='Z' && ch>='A'){
            System.out.println("Given char "+ch+" is Capital case");
        }
        else if(ch<='z' && ch>='a'){
            System.out.println("Given char "+ch+" is Small case");
        }
        else if(ch<='9' && ch>='0'){
            System.out.println("Given char "+ch+" is Numeral");
        }
        else{
            System.out.println("Given char "+ch+" is Special Symbol");
        }
        sc.close();
    }
    
}
