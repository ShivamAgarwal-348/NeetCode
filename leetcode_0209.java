public class leetcode_0209 {
 
    public int minSubArrayLen(int target, int[] nums) {

        int l=0, r=0;
        int sum = 0;
        int min_count = nums.length;
        int len = nums.length;

        while (r < len) {

            sum += nums[r];
            r++;

            while(sum >= target){

                min_count = Math.min(min_count, r - l);
                sum -= nums[l];
                l++;
            }
        }

        if(l == 0 && sum < target){
            return 0;
        }

        return min_count;
    }

    public static void main(String[] args) {
        

    }
}
