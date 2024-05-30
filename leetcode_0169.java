import java.util.*;

public class leetcode_0169 {

    public int majorityElement(int[] nums) {
     
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args) {
        
    }
}
