class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        HashSet <Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i:nums){
            min = Math.min(i,min);
            max = Math.max(i,max);
            set.add(i);
        }

        ArrayList <Integer> result = new ArrayList<>();
        
        for (int k=min;k<=max;k++){
            if(!set.contains(k)){
                result.add(k);
            }
        }
        return result;
    }
}