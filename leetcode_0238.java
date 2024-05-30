import java.util.*;
public class leetcode_0238 {
    
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = 1;
        suffix[nums.length-1] = 1;
        int n = nums.length;
        for (int i = 1; i < suffix.length; i++) {
            
            prefix[i] = prefix[i-1]*nums[i-1];
            suffix[n-1-i] = suffix[n-i]*nums[n-i];
        }
        int ans[] = new int[n];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        
    }
}
