import java.util.*;

public class leetcode_0125 {

    public static boolean isPalindrome(String s) {
        
        String s1 = "";
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isLetterOrDigit(s.charAt(i))){
                continue;
            }
            else{
                s1 += s.charAt(i);
            }
        }
        System.out.println(s1);
        for (int i = 0; i < s1.length()/2; i++) {
            if(s1.charAt(i) != s1.charAt(s1.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
