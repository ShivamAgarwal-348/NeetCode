import java.util.*;

public class leetcode_0739 {

    public int[] dailyTemperatures(int[] temperatures) {
     
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];

        for (int i = 0; i < ans.length; i++) {
            
            int currtemp = temperatures[i];
            if(!stack.isEmpty() && currtemp > temperatures[stack.peek()]){
                while (!stack.isEmpty() && currtemp > temperatures[stack.peek()]) {
                    int j = stack.pop();
                    ans[j] = i-j;
                }
            }

            stack.push(i);
        }
        // for (int i = 0; i < ans.length; i++) {
        //     if(ans[i] == 0){
        //         ans[i] = -1;
        //     }
        // }
        return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
