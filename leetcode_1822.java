public class leetcode_1822 {
    
    public int arraySign(int[] nums) {
        int prod = 1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                return 0;
            }
            else if(nums[i] < 0) {
                prod *= -1;
            }
        }
        return prod;
    }

    public static void main(String[] args) {
        
    }
}
