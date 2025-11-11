public class RecurSortPractic {
    public static void isSorted(int ar[],int idx){
        
        if(idx==ar.length-1||idx==ar.length){
           // remove below line and add another if else and create a base condition above is not one and recurate ine it
            for(int i=0;i<ar.length;i++){
                System.out.print(ar[i]);  
            }
        }
        if(ar[idx]>ar[idx+1]){
            int temp;
            temp=ar[idx];
            ar[idx]=ar[idx+1];
            ar[idx+1]=temp;
        }
       isSorted(ar,idx+1);


    }
    public static void main (String args[]){
       int ar[]={2,3,1};
        /* if(isSorted(ar,0)){
            System.out.println("is sorted");
        }
        else {
            System.out.println("not sorted");
        }
    } */
   isSorted(ar, 0);
    }

}
