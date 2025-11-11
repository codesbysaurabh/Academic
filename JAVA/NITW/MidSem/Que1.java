/*Que1. Consider a scenario in an Institute where there are at most 20 students under 1 faculty and at most 5 faculty
under 1 dean.
At all times, there should be just one director and any number of deans.
A student must always be assigned to a faculty, and a faculty must always be assigned to a dean.
Once a faculty is recruited, maximum possible number of students must be allotted to him/her.
Similarly, if one dean is recruited, maximum possible number of faculty must be allocated to him/her.
Input of a number “n” comprises of all the people in the college and output the number of students, faculty, dean 
and director in the institute for that given n. */
package NITW.MidSem;
import java.util.*;
public class Que1 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter  total number of people (n) : ");
        int n = str.nextInt();
        int director=1;

        if(n<=1){
            System.out.println("Invalid number of people!");
            return;
        }

        if(n==1){
            System.out.println("Students : 0");
            System.out.println("Faculty : 0");
            System.out.println("Deans : 0");
            System.out.println("Directors : 1");
            return;
        }

        n-=1;

        int deans=0,faculty=0,students=0;

        deans = n / ( 5*21 ) ;
        int rem = n % ( 5*21 ) ;

        faculty = deans*5;

        if(rem>0){
            deans+=1;
            faculty+=rem/21;
            if(rem%21!=0) faculty+=1;
        }

        int total_faculty_capacity =faculty*21;
        students=Math.min(n-deans-faculty,faculty*20);
        if(students<0) students = 0;

        System.out.println("Students : " + students );
        System.out.println("Faculty : " + faculty );
        System.out.println("Deans : " + deans );
        System.out.println("Directors : " + director );
        str.close();
    }
    
}
