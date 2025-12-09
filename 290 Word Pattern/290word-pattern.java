class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character,Integer> mp1 = new HashMap <>();
        HashMap <String,Integer> mp2 = new HashMap <>();

        String[] str = s.split(" ");
        if (str.length!=pattern.length()) return false;

        for (int i=0;i<pattern.length();i++){
            char ch1 = pattern.charAt(i);
            String ch2 = str[i];
            if (!mp1.containsKey(ch1)) mp1.put(ch1,i);
            if (!mp2.containsKey(ch2)) mp2.put(ch2,i);

            if (!mp1.get(ch1).equals(mp2.get(ch2))) return false;
        }
        return true;
    }
}