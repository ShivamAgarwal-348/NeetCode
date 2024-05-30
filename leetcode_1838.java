import java.util.*;

public class leetcode_1838 {

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxlen = 1;
        int l = 0;
        int r = 0;
        long total = 0;
        while (r < nums.length) {
            total += nums[r];
            
            while((long)nums[r]*(r-l+1) > total+k){
                total-=nums[l];
                l+=1;
            }
            
            // System.out.println(l + " " + r + " " + total);
            
            maxlen = Math.max(maxlen, r-l+1);
            r+=1;
        
            
        }
        return maxlen;
    }
    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,1,1000};
        int k = 2;
        System.out.println(maxFrequency(arr, k));
    }
}
