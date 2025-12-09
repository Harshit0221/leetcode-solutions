class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap <Integer,Integer> mp = new HashMap <>();
        // for (int i=0;i<nums.length;i++){
        //     if (!mp.containsKey(nums[i])){
        //         mp.put(nums[i],1);
        //     }else{
        //         mp.put(nums[i],mp.get(nums[i])+1);
        //     }
        // }
        // for (int j:mp.keySet()){
        //     if (mp.get(j)>1) return true;
        // }
        // return false;


        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))  return true;
            set.add(num);
        }
        return false; 
    }
}