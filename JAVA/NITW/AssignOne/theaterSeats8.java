package NITW.AssignOne;
import java.util.*;
public class theaterSeats8 {

    public static int row;
    public static int column;
    public static char ccolumn;
    
    public static void showAvailOptions(char [][] seats){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(seats[i][j]+" ");
            }System.out.println();
        }
        System.out.println("All D seats are VIP");
    }

    public static void updateSeats(char[][] seats){
        if(seats[row][column]=='X'){
            System.out.println("Sorry,this seat is occupied\nPlease make another choice");
            }
        else { 
            if(row>=0 && row<5 && column<5 && column>=0){
            seats[row][column]='X';
            System.out.println("Congrats! Your seat "+(row+1)+ccolumn+" has been booked!");
            }
            else{
            System.out.println( "Enter a valid choice!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner str =new Scanner(System.in);
        char[][] seats=new char[5][5];

        // for (/*char*/int i = 0; i < 5; i++) {
        //     seats[i][0] = (char)((i+1)+'0');
        //     seats[i][1] = 'A';
        //     seats[i][2] = 'B';
        //     seats[i][3] = 'C';
        //     seats[i][4] = 'D';
        // }

        for (int i = 0; i < 5; i++) {
            seats[i][0] = (char)((i+1) + '0');
            for (int j = 1; j < 5; j++) {
                seats[i][j] = (char)('A' + j - 1);
            }
        }
        int control=1;
        while(control>0){

            System.out.println("Available choices for booking are : ");
            showAvailOptions(seats);

            System.out.println("Please Enter your choice\nEnter seat row number : ");
            row =str.nextInt()-1;
            System.out.println("Enter seat column name : ");
            ccolumn=str.next().charAt(0);

            /* System.out.println("Please Enter your choice : "); 
            String choice=str.next();
            row =choice.charAt(0)-'0';
            ccolumn=choice.charAt(1); */


            //  switch (ccolumn) {
            //     case 'A':
            //         column=1;
            //         break;
            //     case 'B':
            //         column=2;
            //         break;
            //     case 'C':
            //         column=3;
            //         break;
            //     case 'D':
            //         column=4;
            //         break;
            
            //     default:
            //         System.out.println("Enter a valid column name!");
            //         break;
            // } 
            column = ccolumn - 'A' + 1;  // 'A' -> 1, 'B' -> 2, ...
            if(column < 1 || column > 4) {
                System.out.println("Enter a valid row name!");
                continue;
            }
            
            updateSeats(seats);

            System.out.println("Enter 1 to continue booking or 0 to end");
            control=str.nextInt();
        }

        System.out.println("Thank you for booking!");
        str.close();
    }
}
