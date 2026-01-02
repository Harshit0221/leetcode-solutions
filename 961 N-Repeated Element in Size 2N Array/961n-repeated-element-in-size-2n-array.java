class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        HashMap <Integer,Integer> mp = new HashMap <>();
        for (int i=0;i<nums.length;i++){
            if (!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        for (int j:mp.keySet()){
            if (mp.get(j)==n) return j;
        }
        return 0;
    }
}