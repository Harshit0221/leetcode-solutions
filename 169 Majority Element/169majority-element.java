public class Solution {
    public int majorityElement(int[] nums) {
  //    Boyer-Moore Majority Vote Algorithm,
  //      int count = 0;
  //      int x = 0;
  //
  //      for (int i = 0; i < nums.length; i++) {
  //          if (count == 0) {
  //              x = nums[i];
  //          }
  //
  //          if (nums[i] == x) {
  //              count++;
  //          } else {
  //              count--;
  //          }
  //      }
  //
  //      return x;
        //   HashMap <Integer,Integer> mp = new HashMap<>();
        //   int n = nums.length;
        //   for (int i=0;i<nums.length;i++){
        //     if(mp.containsKey(nums[i])) mp.put(nums[i],mp.get(nums[i])+1);
        //     else{
        //         mp.put(nums[i],1);
        //     }
        //     if(mp.get(nums[i])>(n/2)) return nums[i];
        //   }
        //   return -1;    

        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
