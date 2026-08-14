class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        HashMap <Character,Integer> mp = new HashMap <>();
        for (int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            mp.put(ch, mp.getOrDefault(ch,0)+1);

            while (mp.get(ch)>2){
                char leftChar = s.charAt(left);
                mp.put(leftChar,mp.get(leftChar)-1);
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}