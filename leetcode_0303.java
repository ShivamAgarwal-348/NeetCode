import java.util.*;
public class leetcode_0303 {
    class NumArray {
    
        int[] arr;

        public NumArray(int[] nums) {
            this.arr = nums;
        }
        
        public int sumRange(int left, int right) {
            int s = 0;
            for (int i = left; i <= right; i++) {
                s += arr[i];
            }
            return s;
        }
    }

    public static void main(String[] args) {
        
    }
}
