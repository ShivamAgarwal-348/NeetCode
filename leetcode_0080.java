public class leetcode_0080 {
    
    public int removeDuplicates(int[] nums) {
        
        int temp1 = Integer.MIN_VALUE;
        int temp2 = Integer.MIN_VALUE;
        
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if(temp1 < nums[i]){
                nums[left] = nums[i];
                temp1 = nums[left];
                left++;
            }
            else if(temp2 < nums[i]){
                nums[left] = nums[i];
                temp2 = nums[left];
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        
    }
}
