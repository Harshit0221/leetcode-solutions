class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr [] = new int [n];

        for (int i=0;i<nums.length;i++){
            arr[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(arr);
        return arr;
    }
}