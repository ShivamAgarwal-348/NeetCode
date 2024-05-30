public class leetcode_0367 {
    
    public boolean isPerfectSquare(int num) {
        
        long low = 1;
        long high = num;
        
        while (low <= high) {
            long mid = low + (high-low)/2;
            
            long res = mid*mid;
            if(res == num){
                return true;
            }
            else if(res < num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
