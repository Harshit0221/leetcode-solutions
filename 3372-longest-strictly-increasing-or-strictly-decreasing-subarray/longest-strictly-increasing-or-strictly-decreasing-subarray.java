class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        if (nums.length==1) return 1;
        int count1 = 0;
        int x = 1;
        for (int i=1;i<nums.length;i++){
            if (nums[i] > nums[i-1]){
                x++;
            }else{
                x=1;
            }
            count1 = Math.max(count1,x);
        }

        int count2 = 0;
        int y = 1;
        for (int i=1;i<nums.length;i++){
            if (nums[i] < nums[i-1]){
                y++;
            }else{
                y=1;
            }
            count2 = Math.max(count2,y);
        }

        return Math.max(count1,count2);
    }
}