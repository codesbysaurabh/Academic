package Recursion.L3ArrSimpRec;

    public class isArrSorted{
        public static boolean isSorted(int ar[],int idx){
        
        if(idx==ar.length-1||idx==ar.length){
            return true;
        }
        if(ar[idx]>ar[idx+1]){
            return false;
        }
       return isSorted(ar,idx+1);

    }
    public static void main (String args[]){
       int ar[]={5,5,6,7,8};
        if(isSorted(ar,0)){
            System.out.println("is sorted");
        }
        else {
            System.out.println("not sorted");
        }
    }
    
}