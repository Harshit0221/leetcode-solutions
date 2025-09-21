class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap <Character,Integer> mp = new LinkedHashMap <>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);   
            } else {
                mp.put(ch, mp.get(ch) + 1); 
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i; 
            }
        }
        return -1;
    }
}