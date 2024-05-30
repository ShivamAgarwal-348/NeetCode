import java.util.*;

public class leetcode_1189 {

    public int maxNumberOfBalloons(String text) {
        
        int[] arr = new int[26];
        for (int i = 0; i < text.length(); i++) {
            arr[text.charAt(i) - 'a']++;
        }

        return Math.min(arr[0], Math.min(arr[1], Math.min(arr[11]/2, Math.min(arr[13], arr[14]/2))));
    }

    public static void main(String[] args) {
        
    }
}
