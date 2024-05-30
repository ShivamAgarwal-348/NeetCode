public class leetcode_1768 {
    
    public String mergeAlternately(String word1, String word2) {
     
        String ans = "";
        int n = Math.min(word1.length(), word2.length());

        for (int i = 0; i < n; i++) {
            ans += word1.charAt(i);
            ans += word2.charAt(i);
        }

        ans += word1.substring(n);
        ans += word2.substring(n);

        return ans;
    }

    public static void main(String[] args) {
        
    }
}
