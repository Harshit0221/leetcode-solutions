class Solution {
    public void reverse (int [] nums , int i,int j){
        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k % n; // add this to handle case when k > nums.length;
        if (n==1) return;  // when only single element array return the same array
        reverse (nums,0,n-1);
        reverse (nums,0,k-1);
        reverse (nums,k,n-1);
    }
}