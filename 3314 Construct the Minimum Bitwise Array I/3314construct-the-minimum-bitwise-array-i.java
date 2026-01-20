class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans [] = new int [nums.size()];
        for (int i=0;i<nums.size();i++){
            ans[i]=-1;   //pehle complete array mei -1 store kr do by default
            for (int j=0;j<nums.get(i);j++){
                int result = j|j+1;
                if (result == nums.get(i)){
                    ans[i] = j;
                    break;
                }  
            }
        }
        return ans;
    }
}