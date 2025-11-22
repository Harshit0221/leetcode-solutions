class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%3!=0) count++;  //because if any number is not divisible by 3 
        }                               //it can be made divisible by either adding or subtracting 1
        return count;

        // int count = 0;
        // for (int i=0;i<nums.length;i++){
        //     if ((nums[i]+1) % 3==0 || (nums[i]-1) % 3==0) count++;
        // }
        // return count;
    }
}