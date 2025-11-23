class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // List<List<Integer>> result = new ArrayList<>();
        // HashSet <List<Integer>> set = new HashSet <>();

        // for (int i=0;i<nums.length;i++){
        //     for (int j=0;j<nums.length;j++){
        //         for (int k=0;k<nums.length;k++){
        //             if(nums[i]+nums[j]+nums[k]==0 && i!=j && i!=k && j!=k){

        //                 List <Integer> ans = new ArrayList<>();

        //                 ans.add(nums[i]);
        //                 ans.add(nums[j]);
        //                 ans.add(nums[k]);

        //                 Collections.sort(ans);
        //                 set.add(ans);
        //             }
        //         }
        //     }
        // }
        // result.addAll(set);
        // return result;

        Arrays.sort(nums);             //shradha didi method
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int j = i+1, k = n-1;

            while (j<k){
                long sum = (long) nums[i]+nums[j]+nums[k];
                if (sum < 0){
                    j++;
                }else if (sum > 0){
                    k--;
                }else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    while (j<k && nums[j]==nums[j-1]) j++;
                }
            }
        }
        return result;
    }
}