public class leetcode_0680 {
    
    public boolean validPalindrome(String s) {
        
        int n = s.length();
        
        for (int i = 0; i < n/2; i++) {
            if(s.charAt(i) == s.charAt(n-1-i)){
                continue;
            }
            else{
                return ispallindrome(s.substring(i+1, n-i)) || ispallindrome(s.substring(i, n-1-i));
            }
        }
        return true;
    }

    public boolean ispallindrome(String s){

        int n = s.length();
        
        for (int i = 0; i < n/2; i++) {
            if(s.charAt(i) == s.charAt(n-1-i)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
