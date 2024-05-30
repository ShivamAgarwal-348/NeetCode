import java.util.*;

public class leetcode_0150 {

    
    public int evalRPN(String[] tokens) {
     
        HashMap<String, Integer> map = new HashMap<>();
        map.put("+", 1);
        map.put("-", 1);
        map.put("*", 2);
        map.put("/", 2);
        int a, b;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            
            String s = tokens[i];

            if(!map.containsKey(s)){
                stack.push(s);
                continue;
            }
            else{
                
                
                a = Integer.valueOf(stack.pop());
                b = Integer.valueOf(stack.pop());
                System.out.println(a + " " + b);
                int c = helper(b, a, s);
                System.out.println(c);
                stack.push(String.valueOf(c));  
                System.out.println(stack.peek());  
            }
            
        }
        return Integer.valueOf(stack.pop());
    }
    public static int helper(int a, int b, String s){
        int c;
        System.out.println(a + " " + b);
        if("+".equals(s)){
            c = a+b;
        }
        else if("-".equals(s)){
            c = a-b;
        }
        else if("*".equals(s)){
            c = a*b;
        }
        else {
            c = a/b;
        }
        return c;
    }
    public static void main(String[] args) {
        
    }
}
