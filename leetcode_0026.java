public class leetcode_0026 {
    
    public int removeDuplicates(int[] nums) {
        
        int i = 0;
        int temp = Integer.MIN_VALUE;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] > temp){
                nums[i] = nums[j];
                temp = nums[i];
                i++;
            }
            
        }

        return i;
    }

    public static void main(String[] args) {
        
    }
}
