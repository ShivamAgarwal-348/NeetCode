import java.util.*;

public class leetcode_0014 {
 
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];
        int count = 0;

        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if(a.charAt(i) == b.charAt(i)){
                count++;
            }
            else{
                break;
            }
        }
        return a.substring(0, count);
    }

    public static void main(String[] args) {
        
    }
}
