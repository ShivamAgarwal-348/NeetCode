import java.util.*;



public class leetcode_0027 {

    public int removeElement(int[] nums, int val) {
        
        int i = 0;
        int j = 0;
        int temp;
        while (i < nums.length) {
            if(nums[i] != val){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        return j;
    }
    public static void main(String[] args) {
        
    }
}
