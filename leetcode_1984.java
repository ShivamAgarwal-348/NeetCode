import java.util.*;

public class leetcode_1984 {
    
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);
        int min = nums[k-1] - nums[0];

        for (int i = 0; i < nums.length - k + 1; i++) {
            if(nums[k+i-1] - nums[i] < min){
                min = nums[k+i-1] - nums[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        
    }
}
