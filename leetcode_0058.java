public class leetcode_0058 {
    
    public int lengthOfLastWord(String s) {
        
        int count = 0;
        boolean word = false;
        for (int i = s.length()-1; i > -1; i--) {
            if(s.charAt(i) == ' ' && word == false){
                continue;
            }
            else if(s.charAt(i) == ' '){
                return count;
            }
            else{
                count++;
                word = true;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        

    }
}
