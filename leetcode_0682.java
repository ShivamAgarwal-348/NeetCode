import java.util.*;

public class leetcode_0682 {
    
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            
            if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(operations[i].equals("+")){
                int temp = stack.pop();
                int res = stack.peek() + temp;
                stack.push(temp);
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        
        while (!stack.isEmpty()) {
            sum+= stack.pop();
        }
        return sum;
        
    }

    public static void main(String[] args) {
        
    }
}
