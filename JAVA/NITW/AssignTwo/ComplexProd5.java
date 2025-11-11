package NITW.AssignTwo;
import java.util.*;
public class ComplexProd5 {

    public static int real1,imag1,real2,imag2,realpart,imagpart;
    public static void cProd() {
        realpart=(real1*real2)-(imag1*imag2);
        imagpart=(real1*imag2)+(real2*imag1);
    }

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.print("Enter real part for first complex number : ");
        real1 = str.nextInt();
        System.out.print("Enter imaginary part for first complex number : ");
        imag1 = str.nextInt();
        System.out.print("Enter real part for secod complex number : ");
        real2 = str.nextInt();
        System.out.print("Enter imaginary part for second complex number : ");
        imag2 = str.nextInt();

        cProd();

        System.out.println("Product of both the complex numbers is "+realpart+" + ( "+imagpart+" )i ");
  
    }
}
