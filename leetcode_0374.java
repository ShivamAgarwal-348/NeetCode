public class leetcode_0374 {
    
    // just for error removal, not working
    public int guess(int n){
        return 1;
    }

    public int guessNumber(int n) {
        
        int low = 1;
        int high = n;
        while (true) {
            
            int mypick = low + (high-low)/2;
            int res = guess(mypick);
            if(res == 0){
                return mypick;
            }
            else if(res > 0){
                low = mypick+1;
            }
            else{
                high = mypick-1;
            }
            
        }
    }
    public static void main(String[] args) {
        
    }
}
