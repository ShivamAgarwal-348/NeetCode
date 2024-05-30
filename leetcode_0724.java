import java.util.*;

public class leetcode_0724 {

    public static int pivotIndex(int[] nums) {

        int s = 0;
        for (int i : nums) {
            s += i;
        }
        
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if(Math.abs(s-nums[i])%2 == 1){
                
            }
            else if(t == (s-nums[i])/2){
                return i;
            }
            t += nums[i];
        }
        return -1;

        
    }
    public static void main(String[] args) {

        int[] arr = {-1, -1, -1, -1, -1, -1};
        System.out.println(pivotIndex(arr));
    }
}
