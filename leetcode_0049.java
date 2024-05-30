import java.util.*;

public class leetcode_0049 {

    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        char[] s;
        String str;
        for (int i = 0; i < strs.length; i++) {
            
            s = strs[i].toCharArray();
            Arrays.sort(s);
            str = new String(s);
            if(!map.containsKey(str)){
                ArrayList<String> a = new ArrayList<>();
                a.add(strs[i]);
                map.put(str, a);
            }
            else{
                map.get(str).add(strs[i]);
            }
        }
        
        List<List<String>> arr = new ArrayList<>();
        for(String s1: map.keySet()){
            arr.add(map.get(s1));
        }
        return arr;
    }
    public static void main(String[] args) {
        
    }
}
