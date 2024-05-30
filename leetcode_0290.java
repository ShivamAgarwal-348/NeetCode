import java.util.*;

public class leetcode_0290 {

    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> map = new HashMap<>();
        int j = 0;
        for (int i = 0; i < pattern.length(); i++) {
            
            String word = "";
            
            while (j < s.length()) {
                if(s.charAt(j) == ' '){
                    j++;
                    break;
                }
                word += s.charAt(j);
                j++;
            }
            if(map.containsKey(pattern.charAt(i))){
                if(map.get(pattern.charAt(i)).compareTo(word) == 0){

                }
                else{
                    
                    return false;
                }
            }
            map.put(pattern.charAt(i), word);
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
