import java.util.*;

public class leetcode_0205 {

    public boolean isIsomorphic(String s, String t) {

       return issomorphic(s, t) && issomorphic(t, s);
    }

    public static boolean issomorphic(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        int[] arr = new int[256];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i)] == -1){
                arr[s.charAt(i)] = t.charAt(i);
            }
            else if(arr[s.charAt(i)] == t.charAt(i)){
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
