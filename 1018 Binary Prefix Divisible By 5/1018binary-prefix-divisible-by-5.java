class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList <Boolean> result = new ArrayList <>();
        int curr = 0;
        for (int i=0;i<nums.length;i++){
            int ans = (curr*2+nums[i])%5;
            if (ans == 0) result.add(true);
            else{
                result.add(false);
            }
            curr = ans;
        }
        return result;
    }
}