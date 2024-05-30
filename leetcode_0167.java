import java.util.*;
public class leetcode_0167 {
    
    public int[] twoSum(int[] numbers, int target) {
        
        int i = 0;
        int j = numbers.length-1;
        int[] arr = new int[2];
        while (true) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            }
            else if (numbers[i] + numbers[j] < target) {
                i++;
            }
            else{
                arr[0] = i+1;
                arr[1] = j+1;
                return arr;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
