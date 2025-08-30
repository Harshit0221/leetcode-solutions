import java.util.*;
class Solution {
    public int longestSubstring(String s, int k) {
        HashMap <Character,Integer> mp = new HashMap <>();
        for (int i=0;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),1);
            }else{
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
        }
        for (int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))<k){
                String leftPart = s.substring(0, i);
                String rightPart = s.substring(i + 1);

                int left_length = longestSubstring(leftPart,k);
                int right_length = longestSubstring(rightPart,k);

                return Math.max(left_length,right_length);
            }
        }
     return s.length();    
    }
}