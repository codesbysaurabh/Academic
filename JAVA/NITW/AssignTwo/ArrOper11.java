package NITW.AssignTwo;
import java.util.*;
public class ArrOper11 {

    public static Scanner str = new Scanner(System.in);
    public static int index,el;

    public static void printArr(int arr[]){
        System.out.println("New Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] InsArrEl(int arr[]){
        System.out.println("Enter index where you wish to insert element : ");
        index=str.nextInt();
        System.out.println("Enter the number you wish to insert : ");
        el=str.nextInt();
        
        int newarr[]=new int[arr.length+1];
        for(int i=0;i<index;i++){
            newarr[i]=arr[i];
        }
        newarr[index]=el;

        for(int i=index;i<arr.length;i++){
            newarr[i+1]=arr[i];
        }
        return newarr;
    }
    public static int[] DelArrEl(int arr[]){
        System.out.println("Enter index where you wish to delete element : ");
        index=str.nextInt();
        for(int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length]=0;

        return arr;
    }
    public static int[] RepArrEl(int arr[]){
        System.out.println("Enter index where you wish to replace element : ");
        index=str.nextInt();
        System.out.println("Enter the number you wish to replace with : ");
        el=str.nextInt();

        arr[index]=el;

        return arr;
    }
    public static void SearArrEl(int arr[]){

        System.out.println("Enter the number you wish to search : ");
        el=str.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el){
                System.out.println(el+" is found at index : "+i);
            }
        }
        return;
    }

    public static void main(String[] args){
        
        System.out.println("Enter Array Size : ");
        int size =str.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<size;i++){
            arr[i]=str.nextInt();
        }
        System.out.println("Choose the command \n1.To insert an element \n2.To delete an element \n3.To replace an element\n4.To search an element");
        int choice=str.nextInt();

        switch(choice){
            case 1 : {
                printArr(InsArrEl(arr));
                break;
            }
            case 2 : {
                printArr(DelArrEl(arr));
                break;
            }
            case 3 : {
                printArr(RepArrEl(arr));
                break;
            }
            case 4 : {
                SearArrEl(arr);
                break;
            }
        }
    }
}
