import java.util.*;
public class leetcode_0003 {
    

    public int lengthOfLongestSubstring(String s) {
     
        HashSet<Character> set = new HashSet<>();

        int i = 0;
        int j = 0;
        int maxcount = 0;
        while (i <= j && j < s.length()) {
            
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
            maxcount = Math.max(maxcount, j-i);
        }
        maxcount = Math.max(maxcount, j-i);
        return maxcount;
    }
    public static void main(String[] args) {
        
    }
}
