class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int maxLen = 0;
        int i = 0;
        for (int j=0;j<nums.length;j++){
            if (nums[j]==0){
                count++;
            }
            while (count > k) {
                if (nums[i] == 0) {
                    count--;
                }
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}