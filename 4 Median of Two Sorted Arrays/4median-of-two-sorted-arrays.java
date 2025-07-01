class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int b[] = new int [m+n];

        for (int i=0;i<m;i++){
            b[i] = nums1[i];
        }
         for (int i=0;i<n;i++){
            b[m+i] = nums2[i];
        }

       Arrays.sort(b);

       
        double middle;
        if (b.length % 2 == 1) {
              middle = b[b.length / 2];   
        } else {
              middle = (b[b.length / 2 - 1] + b[b.length / 2]) / 2.0;
        }
        return middle;
    }
}
    
