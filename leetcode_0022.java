import java.util.*;

public class leetcode_0022 {

    public List<String> generateParenthesis(int n) {
        
        ArrayList<String> list = new ArrayList<String>();
        helper(list, "", 0, 0, n);
        return list;
    }

    public static void helper(ArrayList<String> list, String s, int open, int close, int max){

        if(close == max){
            list.add(s);
            return;
        }

        if(open < max){
            helper(list, s + "(", open+1, close, max);
        }
        if(open > close){
            helper(list, s + ")", open, close+1, max);
        }

    }

    public static void main(String[] args) {
        
    }
}
