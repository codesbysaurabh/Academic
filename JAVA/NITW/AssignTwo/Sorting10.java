package NITW.AssignTwo;
import java.util.*;
public class Sorting10 {

    public static Scanner str = new Scanner(System.in);
    public static int bubblesort(int arr[],int bcount){

        for(int pass = 0; pass < arr.length - 1; pass++) {
            for(int i=0;i<arr.length-1-pass;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    bcount++;
                }
            }
        }
        printArray(arr);
        return bcount;
    }
    public static int selectionsort(int arr[],int scount){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                    //scount++;
                }
            }
            if (smallest!=i) {
                    int temp=arr[smallest];
                    arr[smallest]=arr[i];
                    arr[i]=temp;
            }
        }
        printArray(arr);
        return scount;
    }
    public static int insertionsort(int arr[],int icount){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
                icount++;
            }
            arr[j+1]=curr;
        }
        printArray(arr);
        return icount;
    }

    public static void printArray(int arr[]){
        System.out.println("Sorted Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    /* public static void inputArray(int arr[]){
        int arr[]
        for(int i=0;i<arr.length;i++){
            int arr[i]=str.nextInt();
        }
    } */
    public static void main(String[] args) {
        System.out.print("Enter array size : ");
        int size = str.nextInt();
        int array[]=new int[size];

        System.out.println("Enter array elements : ");
        for(int i=0;i<array.length;i++){
            array[i]=str.nextInt();
        }

        int arr1[] = new int[size];
        int arr2[] = new int[size];
        int arr3[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr1[i] = array[i];
            arr2[i] = array[i];
            arr3[i] = array[i];
        }
        System.out.println("\n------Bubble Sort------");
        System.out.println("Number of steps taken : "+bubblesort(arr1, 0));
        System.out.println("\n------Selection Sort------");
        System.out.println("Number of steps taken : "+selectionsort(arr2, 0));
        System.out.println("\n------Insertion Sort------");
        System.out.println("Number of steps taken : "+insertionsort(arr3, 0));

    }
}
