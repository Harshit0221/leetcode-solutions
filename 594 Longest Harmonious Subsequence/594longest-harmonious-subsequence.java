class Solution {
    public int findLHS(int[] nums) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        
        for (int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        int length=0,maxLength=0;
        for(int num:nums){
            if(mp.containsKey(num+1)){
                length = mp.get(num)+mp.get(num+1);
                maxLength = Math.max(length,maxLength);
            }
        }
        return maxLength;
    }
}