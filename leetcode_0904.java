import java.util.HashMap;

public class leetcode_0904 {

    public static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        int maxlen = 0;
        for (int j = 0; j < fruits.length; j++) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            while (map.size()>2) {
                map.put(fruits[i], map.get(fruits[i]) - 1);
                map.remove(fruits[i], 0);
                i++;
            }
            maxlen = Math.max(maxlen, j-i+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 1};
        System.out.println(totalFruit(arr));
    }
}
