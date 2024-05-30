import java.util.*;

public class leetcode_1929 {
    
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;

    }

    public static void main(String[] args) {

        
    }
}
