package NITW.MidSem;
import java.util.*;
public class BellTriangle {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the bell row : ");
        int n=str.nextInt();

        int lenght = (n*(n+1))/2; // total elements in triangle
        int arr[] = new int [lenght];

        arr[0] = 1; // first element of Bell Triangle

       /*  int counter=0,end=1;

        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    System.out.print(end);
                    continue;
                }
                System.out.print(arr[i]);
                arr[i+1]=arr[i]+arr[i-counter];
                counter++;
                if(j==i) end=arr[i];
            }
            System.out.println();
        }
    }
} */

        int index = 1; // to fill array
        int prevRowStart = 0; // start index of previous row

        // build each row
        for (int i = 1; i < n; i++) {
            int currRowStart = index;
            arr[index++] = arr[prevRowStart + i - 1]; // first element = last element of previous row

            // generate rest of the row
            for (int j = 1; j <= i; j++) {
                arr[index] = arr[index - 1] + arr[prevRowStart + j - 1];
                index++;
            }

            prevRowStart = currRowStart;
        }

        // print Bell triangle
        index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(arr[index++] + " ");
            }
            System.out.println();
        }
    }
}

