import java.util.*;

public class leetcode_0128 {

    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : nums) {
            set.add(integer);
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (Integer integer : nums) {
            if(!set.contains(integer-1)){
                arr.add(integer);
            }
        }

        int maxcount = 0;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            count = 0;
            int a = arr.get(i);
            while (set.contains(a)) {
                count++;
                a++;
            }
            maxcount = Math.max(maxcount, count);
        }
        
        return maxcount;
    }
    public static void main(String[] args) {
        
    }
}
