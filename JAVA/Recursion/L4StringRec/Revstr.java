package Recursion.L4StringRec;

//Done by Chatgpt and has similar concept to shradha mam's
public class Revstr {
    public static String ReverseString(String ar,int idx){
        if (idx == ar.length()) {
            return "";
        }
        char currChar = ar.charAt(idx);
        String newString = ReverseString(ar, idx + 1);
        return newString + currChar;
    }
    public static void main(String[] args) {
        System.out.println(ReverseString("strange", 0));
    }
}


// IN JAVA STRINGs ARE IMMUTABLE 
//my try

/* public class Revstr {
    public static char temp;
    //public static String new_ar;
    public static char a,b;
    public static void ReverseString(String ar,int idx){
        if(idx==ar.length()){
            System.out.println(ar);
            return;
        }
        a=ar.charAt(idx);b=ar.charAt(ar.length()-1-idx);
        temp = a;
        a=b;
        b=temp;
        ReverseString(ar,idx+1);
    }
    public static void main(String[] args) {
        ReverseString("strange",0);
    }
} */

//shradha mam code

/* public static String revString(String str) {
if(str.length() == 1) {
return str;
}
char currChar = str.charAt(0);
String nextString = revString(str.substring(1));
return nextString + currChar;
}
public static void main(String args[]) {

String str = "abcd";
String reversed = revString(str);
System.out.println(reversed);
} */


