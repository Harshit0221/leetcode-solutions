class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        
        for (int i=1;i<nums.length-1;i++){
            if (nums[i] == 2 * (nums[i-1] + nums[i+1])){
                count++;
            }
        }
        return count;
    }
}


// This means that for each triplet [a, b, c], the middle element b should be exactly twice the sum of its neighbors a and c. For example, in the subarray [1, 6, 2], 6 = 2 * (1 + 2) holds true, so it's a valid subarray.