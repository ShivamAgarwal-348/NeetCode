public class leetcode_0035 {
    
    public int searchInsert(int[] nums, int target) {

        return helper(nums, 0, nums.length-1, target);

    }

    public int helper(int[] nums, int low, int high, int target){

        if(low > high){
            return low;
        }
        int mid = low + (high-low)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] > target){
            return helper(nums, low, mid - 1, target);
        }
        else{
            return helper(nums, mid+1, high, target);
        }

    }

    public static void main(String[] args) {
        
    }
}
