import java.util.*;

public class leetcode_0219 {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i - left > k){
                set.remove(nums[left]);
                left++;
            }
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
            
        }
        return false;


    }

    public static void main(String[] args) {
        
    }
}
