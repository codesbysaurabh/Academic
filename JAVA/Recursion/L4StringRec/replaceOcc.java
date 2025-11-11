package Recursion.L4StringRec;

public class replaceOcc {
    public static void newString(String str,int idx,char el,StringBuilder result){
        if(idx==str.length()){
            System.out.println("New String is "+result);
            return;
        }
        if(str.charAt(idx)==el){
            result.append('o');
        }
        else{
            result.append(str.charAt(idx));
        }
        newString(str, idx+1, el,result);
        return ;

    }
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        newString("saurabh", 0, 'a', result);
        
    }
}
