// there was error of local inizialization of smallest , middle , biggest due to if else not covering all cases


package NITW.AssignOne;
import java.util.Scanner;

public class Menu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println("Choose operation from : \n1.Product \n2.Smallest\n3.Middle\n4.Biggest");
        char operation = sc.next().charAt(0);

        int biggest,middle,smallest;
        
        if(n1>n2 && n1>n3){
            biggest=n1;
            if(n2>=n3){
                middle=n2;
                smallest=n3;
            }
            else {
                middle=n3;
                smallest=n2;
            }           
        }
        else if(n2>n1 && n2>n3 ){
            biggest=n2;
            if(n1>=n3){
                middle=n1;
                smallest=n3;
            }
            else {
                middle=n3;
                smallest=n1;
            }
        }
        else if(n3>n1 && n3>n2){
            biggest=n3;
            if(n2>=n1){
                middle=n2;
                smallest=n1;
            }
            else {
                middle=n1;
                smallest=n2;
            }
        }
        else {
            /* if(n1==n2 && n2==n3){
                smallest=middle=biggest=n1;
            }
            else if(n1==n2){
                smallest=n3;
                middle=biggest=n1;

            }
            else if(n2==n3){
                smallest=n1;
                middle=biggest=n2;

            }
            else if(n1==n3){
                smallest=n2;
                middle=biggest=n1;
            } */
            biggest=n3;
            if(n1>=n2){
            middle=n1;
            smallest=n2;
             }
            else {
            middle=n2;
            smallest=n1;
        }
        }
        
        int product = n1*n2*n3 ;

        switch (operation) {
            case '1' :
                System.out.println("Product = "+product);
                break;
            case '2':
                System.out.println("Smallest is "+smallest);
                break;
            case '3':
                System.out.println(middle);
                break;
            case '4':
            System.out.println(biggest);
            break;
            default:
            System.out.println("Enter a valid choice ");
                break;
        }
        sc.close();
        }




        
    }  

