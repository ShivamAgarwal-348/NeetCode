import java.util.*;

public class leetcode_0015 {

    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        List<List<Integer>> arrs = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n-2; i++) {

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            
            int j = i+1;
            int k = n-1;
            int target = 0 - nums[i];
            while (j < k) {
                
                int start = nums[j];
                int end = nums[k];

                if(start + end > target){
                    k--;
                }
                else if(start + end < target){
                    j++;
                }
                else{
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(-target);
                    arr.add(start);
                    arr.add(end);
                    arrs.add(arr);
                    System.out.println(i + " " + j + " " + k);
                    while (j < n-1 && nums[j] == nums[j+1]) {
                        j++;
                    }
                    j++;
                    while (k > i && nums[k] == nums[k-1]) {
                        k--;
                    }
                    k--;

                }
            }

        }
        return arrs;
        
    }
    
    public static void main(String[] args) {
        
    }
}
