public class leetcode_0704 {
    

    public int search(int[] nums, int target) {
    
        return helper(nums, target, 0, nums.length-1);
    }

    public static int helper(int[] nums, int target, int low, int high){

        if(low > high){
            return -1;
        }
        int mid = low + (high-low)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] > target){
            return helper(nums, target, low, mid - 1);
        }
        else{
            return helper(nums, target, mid+1, high);
        }
    }
    public static void main(String[] args) {
        
    }
}
