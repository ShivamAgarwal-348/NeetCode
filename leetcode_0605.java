import java.util.*;

public class leetcode_0605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int[] arr = new int[flowerbed.length + 2];
        arr[0] = 0;
        arr[arr.length-1] = 0;
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            arr[i+1] = flowerbed[i];
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i-1] == 0 && arr[i] == 0 && arr[i+1] == 0){
                count ++ ;
                arr[i] = 1;
            }
        }
        return n <= count; 

    }

    public static void main(String[] args) {
        
    }
}
