public class leetcode_0028 {
    
    public int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.length() - i < needle.length()){
                return -1;
            }
            if(haystack.charAt(i) == needle.charAt(0)){
                for (int j = 0; j < needle.length(); j++) {
                    if(haystack.charAt(i + j) == needle.charAt(j)){
                        if(j == needle.length() - 1){
                            return i;
                        }
                        continue;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        
    }
}
