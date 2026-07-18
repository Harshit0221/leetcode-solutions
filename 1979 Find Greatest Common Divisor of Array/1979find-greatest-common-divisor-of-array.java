class Solution {
    public int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>largest){
                largest=nums[i];
            }
        }
        for (int j=0;j<nums.length;j++){
            if (nums[j]<smallest){
                smallest = nums[j];
            }
        }

        return gcd (smallest,largest);
    }

    public int gcd (int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}