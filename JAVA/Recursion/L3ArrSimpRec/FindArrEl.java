package Recursion.L3ArrSimpRec;

public class FindArrEl {
    public static int test;   
    public static void search(int ar[], int idx,int el){
        if(idx==ar.length){
            return;
        }
        if(ar[idx]==el){
            System.out.println("found at index "+idx);
            test=1;
        }
        search(ar, idx+1, el);

        // if(ar[idx]==el){
        //     System.out.println("found at "+idx);
        //     test=1;
        // }
        
    }
    public static void main(String[] args) {
        int ar[]={2,3,4,7,7};
        test=0;
        search(ar, 0, 7);
        if(test==0){
            System.out.println("never found ");
        }
    }
    
}


// temporary code : code at first try

 /* public static int test;   
    public static void search(int ar[], int idx,int el){

        if(ar[idx]==el){
            System.out.println("found at "+idx);
            test=1;
        }
        
        if(idx==-1){
            if(test==0){
            System.out.println("not found");
            return;
            }
            if(test==1){
                return;
            }
        }
        search(ar, idx-1, el);
        // if(ar[idx]==el){
        //     System.out.println("found at "+idx);
        //     test=1;
        // }
    }
    public static void main(String[] args) {
        int ar[]={2,3,4,7,1};
        test=0;
        search(ar, ar.length, 7);
        // if(test==0){
        //     System.out.println("never found ");
        // }
    }
    
}
 */