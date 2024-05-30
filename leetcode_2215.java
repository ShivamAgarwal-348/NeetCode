import java.util.*;

public class leetcode_2215 {
    
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            n1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            n2.add(nums2[i]);
        }

        for(int n: n1){
            if(n2.contains(n)){
                continue;
            }
            else{
                list1.add(n);
            }
        }
        for(int n: n2){
            if(n1.contains(n)){
                continue;
            }
            else{
                list2.add(n);
            }
        }

        list.add(list1);
        list.add(list2);

        return list;


    }

    public static void main(String[] args) {
        
    }
}
