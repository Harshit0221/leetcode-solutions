class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList <Integer> result = new ArrayList <>();
        for (int x:nums){
            result.add(x);
        }

        int count = 0;

        while (!isSorted(result)){
            int minSum = Integer.MAX_VALUE;
            int idx = 0;
            for (int i=0;i<result.size()-1;i++){
                int sum = result.get(i) + result.get(i+1);
                if (sum < minSum){
                    minSum = sum;
                    idx = i;
                }
            }

            result.remove(idx);
            result.remove(idx);
            result.add(idx,minSum);
            count++;
        }
        return count;
    }
    public boolean isSorted (ArrayList <Integer> result){
        for (int i=1;i<result.size();i++){
            if (result.get(i)<result.get(i-1)){
                return false;
            }
        }
        return true;
    }
}