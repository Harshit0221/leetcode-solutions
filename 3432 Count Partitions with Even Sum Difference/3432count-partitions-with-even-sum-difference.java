class Solution {
    public int countPartitions(int[] nums) {
        
        int count = 0;
        int k = 1;
        while (k<nums.length){
            int sum1 = 0;
            int sum2 = 0;
            for (int i=0;i<k;i++){
            sum1 = sum1 + nums[i];
            }
            for (int j=k;j<nums.length;j++){
                sum2 = sum2 + nums[j];
            }
            if ((sum1-sum2) % 2 == 0) count++;
            k++;
        }
        return count;
    }
}