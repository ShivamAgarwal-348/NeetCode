
public class leetcode_0441 {
    
    public int arrangeCoins(int n) {
        
        long N = n;
        double res = (Math.sqrt(1+8*N)-1)/2;
        return (int)Math.floor(res);
    }

    public static void main(String[] args) {
        
    }
}
