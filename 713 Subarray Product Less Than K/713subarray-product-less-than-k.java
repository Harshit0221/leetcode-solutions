class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // edge case, no product can be < 1

        int product = 1, count = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;  // if product is >=100 then left wala index ek aage badha do aur poduct mei se uski value divide krke hata do
            }

            count += (right - left + 1);
        }

        return count;
    }
}