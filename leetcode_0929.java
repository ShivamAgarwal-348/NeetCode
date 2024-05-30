import java.util.*;



public class leetcode_0929 {

    public int numUniqueEmails(String[] emails) {
        
        HashSet<String> set = new HashSet<>();

        boolean plus;
        boolean at;
        int count = 0;
        for (int i = 0; i < emails.length; i++) {
            String s = "";
            plus = false;
            at = false;
            for (int j = 0; j < emails[i].length(); j++) {
                char c = emails[i].charAt(j);
                if(at == true){
                    s += c;
                }
                else if(c == '@'){
                    at = true;
                    s += c;
                }
                else if(plus && at == false){
                    continue;
                }
                else if(c == '.' && at == false){
                    continue;
                }
                
                else if(c == '+'){
                    plus = true;
                }
                else{
                    s += c;
                }
            }
            if(set.contains(s)){
                
            }
            else{
                set.add(s);
                count++;
            }
            // System.out.println(s);
            
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
