class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> mp = new HashSet <>();
        int start = 0;
        int maxlen = 0;

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            while (mp.contains(ch)){
                mp.remove(s.charAt(start));
                start++;
            }
            mp.add(ch);
            maxlen = Math.max(maxlen,i-start+1);
        }
        return maxlen;
    }
}