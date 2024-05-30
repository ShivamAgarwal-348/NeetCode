public class leetcode_1299 {
    

    public int[] replaceElements(int[] arr) {
     
        int n = arr.length;
        int[] newarr = new int[n];
        newarr[n-1] = -1;
        for (int i = 0; i < n-1; i++) {
            newarr[n-2-i] = Math.max(newarr[n-1-i], arr[n-1-i]);
        }
        return newarr;
        
    }
    public static void main(String[] args) {
        
    }
}
