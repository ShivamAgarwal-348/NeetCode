public class leetcode_0088 {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int temp[] = new int[m];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums1[i];
        }

        int i = 0;
        int j = 0;
        int k = 0;
        while (i<m && j<n) {
            
            if(temp[i]<=nums2[j]){
                nums1[k] = temp[i];
                i++;
                k++;
            }
            else{
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i<m) {
            
            nums1[k] = temp[i];
            i++;
            k++;
                        
        }
        while (j<n) {
            
            nums1[k] = nums2[j];
            j++;
            k++;        
        }


    }

    public static void main(String[] args) {
        
    }
}
