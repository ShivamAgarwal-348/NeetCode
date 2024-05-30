import java.util.*;

public class leetcode_0347 {

    class Pair implements Comparable<Pair>{

        int key;
        int value;
        public Pair(int key, int value){
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(Pair p){
            return p.value - this.value;
        }

    }

    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int key: map.keySet()){
            pq.add(new Pair(key, map.get(key)));
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().key;
        }
        return ans;
        
    }

    public static void main(String[] args) {
        
    }
}
