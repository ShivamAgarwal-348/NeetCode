import java.util.*;

public class leetcode_0121 {


    public int maxProfit(int[] prices) {
     
        int l = 0;
        int r = 1;
        int maxprofit = 0;
        while (r < prices.length) {
            
            if(prices[r] < prices[l]){
                l = r;
                r++;
                continue;
            }
            maxprofit = Math.max(maxprofit, prices[r] - prices[l]);
            r++;
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        
    }
}
