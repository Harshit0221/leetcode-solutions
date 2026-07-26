class Solution {
    public int maximumProduct(int[] nums) {
        // int largest = 0;
        // int secondLargest = 0;
        // int thirdLargest = 0;

        // for (int i=0;i<nums.length;i++){

        //     int n = Math.abs(nums[i]);

        //     if (n>=largest){
        //         thirdLargest = secondLargest;
        //         secondLargest = largest;
        //         largest = nums[i];
        //     }else if (n < largest && n > thirdLargest){
        //         secondLargest = nums[i];
        //     }else if (n < largest && n < secondLargest){
        //         thirdLargest = nums[i];
        //     }
        // }
        // return largest*secondLargest*thirdLargest;


        Arrays.sort(nums);

        int n = nums.length;

        return Math.max(
            nums[n-1] * nums[n-2] * nums[n-3], nums[0] * nums[1] * nums[n-1]
        );
    }
}