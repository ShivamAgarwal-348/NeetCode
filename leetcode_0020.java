import java.util.*;

public class leetcode_0020 {

    public boolean isValid(String s) {
     
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            Character c = s.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                stack.add(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                Character c1 = stack.pop();
                if(c1 == '{' && c == '}'){
                    continue;
                }
                else if(c1 == '[' && c == ']'){
                    continue;
                }
                else if(c1 == '(' && c == ')'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
