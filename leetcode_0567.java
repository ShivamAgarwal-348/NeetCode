import java.util.*;

public class leetcode_0567 {


    public static boolean checkInclusion(String s1, String s2) {
    
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        int j = 0;
        while (i <= j && j < s2.length()) {
            // System.out.println(i + " " + j);
            if(!map1.containsKey(s2.charAt(j))){
                map2.clear();
                j++;
                i = j;
                
            }
            
            else{
                map2.put(s2.charAt(j), map2.getOrDefault(s2.charAt(j), 0) + 1);
                while(map2.get(s2.charAt(j)) > map1.get(s2.charAt(j))){
                    // System.out.println(i + " " + j);
                    map2.put(s2.charAt(i), map2.get(s2.charAt(i))-1);
                    i++;
                }
                j++;
            }

            
            // for(char str : map1.keySet()){
            //     System.out.print(str + " " + map1.get(str) + " ");
            // }
            // System.out.println();
            // for(char str : map2.keySet()){
            //     System.out.print(str + " " + map2.get(str) + " ");
            // }
            // System.out.println();
            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("mart", "karma"));
    }
}
