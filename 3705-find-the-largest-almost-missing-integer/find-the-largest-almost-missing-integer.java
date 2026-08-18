class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap <Integer,Integer> mp = new HashMap <>();
        for (int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }

        //if k == nums.length
        if (k==nums.length){
            int max = 0;
            for (int n:nums){
                max = Math.max(n,max);
            }
            return max;
        }

        //if k == 1;
        if (k==1){
            int ans = -1;
            for (int n:nums){
                if (mp.get(n)==1){
                    ans = Math.max(ans,n);
                }
            }
            return ans;
        }

        // if k == any number
    
        int res = -1;
        if (mp.get(nums[0])==1){
            res = Math.max(res,nums[0]);
        }
        if (mp.get(nums[nums.length-1])==1){
            res = Math.max(res,nums[nums.length-1]);
        }
        
        return res;
    }
}