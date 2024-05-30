import java.util.*;

public class leetcode_0042 {

    public int trap(int[] height) {
    
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        
        for (int i = 1; i < right.length; i++) {
            left[i] = Math.max(left[i-1], height[i-1]);
            right[height.length-1-i] = Math.max(right[height.length-i], height[height.length-i]);
        }
        int res = 0;
        for (int i = 0; i < right.length; i++) {
            System.out.println(left[i] + " " + right[i]);
            res += Math.max(0, Math.min(left[i], right[i]) - height[i]);
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        
    }
}
