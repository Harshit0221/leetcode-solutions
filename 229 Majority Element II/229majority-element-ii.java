class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        HashMap <Integer,Integer> mp = new HashMap <>();

        ArrayList <Integer> result = new ArrayList<>();

        for (int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])) mp.put(nums[i],1);
            else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }

        for (int i : mp.keySet()) {
            if (mp.get(i) > n / 3)  result.add(i);
        }
    return result;
    }
}