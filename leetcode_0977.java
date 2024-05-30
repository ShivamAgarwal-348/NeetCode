public class leetcode_0977 {
    
    public int[] sortedSquares(int[] nums) {
     
        int res[] = new int[nums.length];
        int left = 0;
        int right = nums.length-1;

        for (int i = res.length-1; i > -1 ; i--) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[i] = nums[left]*nums[left];
                left++;
            }
            else{
                res[i] = nums[right]*nums[right];
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
