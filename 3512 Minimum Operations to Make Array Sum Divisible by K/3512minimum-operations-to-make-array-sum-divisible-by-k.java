class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum % k;
        // int sumOfArray = 0;
        // for (int i=0;i<nums.length;i++){
        //     sumOfArray += nums[i];
        // }
        // if (sumOfArray % k == 0) return 0;
        // int divNum = 0;
        // int num = Integer.MIN_VALUE;
        // for (int j=0;j<sumOfArray;j++){
        //     if (j % k == 0){
        //         divNum = j;
        //     }
        //     num = Math.max(num,divNum);
        // }
        // return sumOfArray-num;
    }
}

// suppose our array is 3,9,7 and k is 5
// sum of array = 3+9+7=19 which is not divisible by 5
// toh aise numbers find karo jo 19 se chote hain aur k (i.e.5) se divisible ho which are 0,5,10,15
// ab inme se max number utha lo which is 15 
// ab sum of array minus ye max num ka difference return kar do 
