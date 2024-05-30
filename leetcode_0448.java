import java.util.*;

public class leetcode_0448 {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = Math.abs(nums[Math.abs(nums[i]) - 1]) * (-1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                arr.add(i+1);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        
    }
}
