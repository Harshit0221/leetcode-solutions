class Solution {
    public int smallestIndex(int[] nums) {
        int ans = 0;
        int minIndex = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            if (sumOfDigits(nums[i]) == i){
                ans = i;
                minIndex = Math.min(ans,minIndex);
            }
        }
        if (minIndex == Integer.MAX_VALUE){
            return -1;
        }
        return minIndex;
    }

    public int sumOfDigits (int n){
        int sum = 0;
        while (n>0){
            int lastDig = n%10;
            sum = sum + lastDig;
            n = n/10;
        }
        return sum;
    }
}