public class leetcode_1888 {

    public static int minFlips(String s) {
        
        String target = s + s;
        StringBuilder match = new StringBuilder("");
        
        int s_length = s.length();

        for (int i = 0; i < s_length; i++) {
            match.append("01");
        }

        int count1 = 0, count2 = 0, min_count = target.length(), low_bound = 0;
        
        for (int i = 0; i < target.length(); i++) {
        
            if(target.charAt(i) == match.charAt(i)){
                count2++;
            }
            else{
                count1++;
            }
            if(i >= s_length){
                if(target.charAt(low_bound) != match.charAt(low_bound)){
                    count1--;
                }
                else{
                    count2--;
                }
                low_bound++;
            }
            if(i>=s_length-1){
                min_count = Math.min(Math.min(count1, count2), min_count);
            }

        }
        
        return min_count;
    }
    public static void main(String[] args) {
        minFlips("01001001101");
    }
}
