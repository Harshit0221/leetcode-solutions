class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap <Integer,Integer> mp = new HashMap <>();
        Stack <Integer> st = new Stack <>();

        for (int num:nums2){
            while (!st.isEmpty() && st.peek()<num){
                mp.put(st.peek(),num);
                st.pop();
            }
            st.push(num);
        }

        while (!st.isEmpty()){
            mp.put(st.peek(),-1);
            st.pop();
        }

        int [] result = new int [nums1.length];
        for (int i=0;i<nums1.length;i++){
            result [i] = mp.get(nums1[i]);
        }
        return result;
    }
}