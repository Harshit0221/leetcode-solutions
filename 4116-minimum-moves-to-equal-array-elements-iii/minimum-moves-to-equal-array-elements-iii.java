class Solution {
    public int minMoves(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            largest = Math.max(largest,nums[i]);
        }
        
        int count = 0;
        for (int i=0;i<nums.length;i++){
            int diff = largest-nums[i];
            count = count + diff;
        }

        return count;
    }
}