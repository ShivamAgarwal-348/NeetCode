import java.util.*;
public class leetcode_0496 {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!s.isEmpty() && s.peek() < nums2[i]) {

                    map.put(s.pop(), nums2[i]);
                }
                s.push(nums2[i]);
        }
        while (!s.isEmpty()) {
            // int a = s.pop();
            map.put(s.pop(), -1);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }

        return nums1;
    }

    public static void main(String[] args) {
        
    }
}
