import java.util.*;

public class leetcode_0011 {

    
    public int maxArea(int[] height) {
        
        int maxarea = 0;
        int i = 0;
        int j = height.length-1;

        while (i < j) {
            int start = height[i];
            int end = height[j];

            maxarea = Math.max(maxarea, Math.min(start, end) * (j-i));

            if(start < end){
                i++;
            }
            else{
                j--;
            }
        }
        return maxarea;

    }

    public static void main(String[] args) {
        
    }
}
