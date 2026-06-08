class Solution {
    public int[] twoSum(int nums[], int target) {    
    //    for (int i = 0; i < nums.length; i++) {
    //        for (int j = i + 1; j < nums.length; j++) {
    //            if (nums[i] + nums[j] == target) {
    //                return new int[] {i, j}; 
    //            }
    //        }
    //    }
    //    return new int[] {}; // If no pair found
    //}
        HashMap <Integer,Integer> mp = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])) return new int[] {i,mp.get(target-nums[i])}; //because n1+n2=target so n2=target-n1
            else{
                mp.put(nums[i],i);
            }
        }
        return new int[] {}; // If no pair found  


        // below method only works if array is sorted
        
        // int left = 0;
        // int right = numbers.length - 1;

        // while (left < right) {
        //     int sum = numbers[left] + numbers[right];

        //     if (sum == target) {
        //         // If 1-based index is required
        //         return new int[]{left + 1, right + 1};
        //     } else if (sum < target) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }

        // return new int[]{-1, -1}; // if not found
    }   
}