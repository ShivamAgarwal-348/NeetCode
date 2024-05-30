import java.util.*;

public class leetcode_0424 {

    public int characterReplacement(String s, int k) {
        
        int[] arr = new int[26];
        int i = 0;
        int j = 0;
        int maxfreq = 0;
        int maxlen = 0;
        while (i<=j && j < s.length()) {
            
            char start = s.charAt(i);
            char end = s.charAt(j);

            arr[end - 'A']++;
            maxfreq = Math.max(maxfreq, arr[end - 'A']);

            while (j - i + 1 - maxfreq > k) {
                start = s.charAt(i);
                arr[start - 'A']--;
                i++;
            }
            maxlen = Math.max(maxlen, j-i+1);
            j++;
        }
        return maxlen;

    }

    public static void main(String[] args) {
        
    }
}
