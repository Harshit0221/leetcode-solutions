class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> st = new HashSet<>();
        for (int n:nums) st.add(n);  //creating a hashset with all elements of our array
        int maxStreak = 0;
        for (int n:st){
            if (!st.contains(n-1)){
                int currNum = n;  //if n-1 does not exist then n is the starting point
                int currStreak = 1;
                while(st.contains(currNum+1)){
                    currNum++;
                    currStreak++;
                }
                maxStreak = Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
}