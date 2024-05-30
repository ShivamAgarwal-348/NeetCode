import java.util.*;

public class leetcode_0001 {
    

    public static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                int a = i;
                int b = map.get(target - nums[i]);
                int[] arr = {Math.min(a, b), Math.max(a, b)};
                return arr;
            }
            else{
                map.put(nums[i], i);
            }
            
        }
        
        int[] arr = {0, 1};
        return arr;
    }
    public static void main(String[] args) {
        
    }
}
