package Recursion.L4StringRec;

public class PalindString {
    public static void checkPalindrom(String str, int idx) {
        int n = str.length();
        
        // Base case: checked till middle successfully
        if (idx >= n / 2) { //very imppppppp 
            System.out.println("String \"" + str + "\" is palindrome");
            return;
        }
        
        // Mismatch found
        if (str.charAt(idx) != str.charAt(n - 1 - idx)) {
            System.out.println("String \"" + str + "\" is NOT palindrome");
            return;
        }

        checkPalindrom(str, idx + 1);
    }

    public static void main(String[] args) {
        checkPalindrom("strarts", 0);   // Palindrome
        checkPalindrom("hello", 0);     // Not palindrome
    }
}

//my initail code

/* public static void checkPalindrom(String str, int idx,int test){ 
        if(idx==str.length()-1){
                if(test==1){
                    System.out.println("String "+str+" is palindrome");
                }
                else{
                    System.out.println("String "+str+" not is palindrome");
                }
                return;
        }
        if(str.charAt(idx)==str.charAt(str.length()-1-idx)){
                test=1;
        }
        else{
            test=0;
        }
        checkPalindrom(str,idx+1, test);
    }
    public static void main(String[] args) {
        checkPalindrom("strarts", 0, 0);
    }
     */