class Solution {
    public int[] runningSum(int[] nums) {
        int sum[] = new int [nums.length];
        int k= 0 ;
        

        for (int i=0;i< nums.length;i++){
            k = k + nums[i];
            sum [i] = k;
        }
        return sum;
    }
}