package Recursion.L3ArrSimpRec;

public class FirstOcLastOc {
    public static int first = -1;
    public static int last = -1;
    public static void Occ(String ar,int idx ,char el){
        if(idx==ar.length()){

            return;
        }
        if(ar.charAt(idx)==el){
            if(first==-1){
                first=idx;
                System.out.println("first Occurance at index : "+first);
                //first=0;
            }
            else{
            last=idx;
            }
        }
         Occ(ar, idx+1, el);
    }
    public static void main(String[] args) {
        //String ar =;
        Occ("bbabcdgaahakk", 0, 'a');
        System.out.println("last occurance of is at index : "+last);

    }
}
