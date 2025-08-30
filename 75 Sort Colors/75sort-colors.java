class Solution {
    public void sortColors(int[] nums) {
         
        int low = 0, mid = 0, high = nums.length-1;

        while (mid<=high){
            if(nums[mid]==0){  //swap low and mid
               int temp = nums[low];
               nums[low] = nums[mid];
               nums[mid] = temp;
               low++;
               mid++;
            }else if (nums[mid]==1){ //mid++ only
                mid++;
            }else{  //swap mid and high
               int temp = nums[mid];
               nums[mid] = nums[high];
               nums[high] = temp;
               high--;
            }
        }
         for (int num : nums) {
            System.out.print(num);
        }
    }
}