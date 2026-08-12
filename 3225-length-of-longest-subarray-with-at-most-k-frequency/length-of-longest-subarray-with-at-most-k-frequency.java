class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxLen = 0;
        int left = 0;

        HashMap <Integer,Integer> mp = new HashMap <>();

        for (int right = 0;right<nums.length;right++){
            if (!mp.containsKey(nums[right])){
                mp.put(nums[right],1);
            }else{
                mp.put(nums[right],mp.get(nums[right])+1);
            }

            while (mp.get(nums[right]) > k){
                mp.put(nums[left],mp.get(nums[left])-1);
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}