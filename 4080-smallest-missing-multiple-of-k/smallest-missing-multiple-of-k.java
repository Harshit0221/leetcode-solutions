class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet <Integer> st = new HashSet <>();
        for (int n:nums){
            st.add(n);
        }

        for (int i=1;;i++){
            if (i%k==0 && !st.contains(i)){
                return i;
            }
        }

    }
}