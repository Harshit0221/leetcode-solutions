class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxStreak = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1){
                count++;
                 maxStreak = Math.max(maxStreak,count);
            }
            else{
                count=0;
            }
           
        }
        return maxStreak;
    }
}