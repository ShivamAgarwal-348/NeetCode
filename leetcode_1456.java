public class leetcode_1456 {

    public static int maxVowels(String s, int k) {
        
        int count = 0, maxcount = 0;
        int i = 0, j = 0;
        
        for (j = 0; j < k; j++) {
            char c = s.charAt(j);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        maxcount = count;
        
        for (j = k; j < s.length(); j++){
            char c = s.charAt(j);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
            c = s.charAt(i++);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count--;
            }
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }    
    public static void main(String[] args) {
        
    }
}
