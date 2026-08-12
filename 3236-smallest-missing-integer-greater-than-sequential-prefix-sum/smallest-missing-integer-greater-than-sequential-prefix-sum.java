class Solution {
    public int missingInteger(int[] nums) {
        HashSet <Integer> st = new HashSet <>();
        for (int n:nums){
            st.add(n);
        }

        int sum = nums[0];

        for (int i=1;i<nums.length;i++){
            if (nums[i] == nums[i-1]+1){
                sum = sum + nums[i];
            }else{
                break;
            }
        }

        while(st.contains(sum)){
            sum++;
        }
        return sum;
    }
}