class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        Map<Character, Integer> mp1 = new HashMap<>();  // for string s
        Map<Character, Integer> mp2 = new HashMap<>();  // for string p

        for (int i=0;i<p.length();i++){
            if(!mp2.containsKey(p.charAt(i))){
                mp2.put(p.charAt(i),1);
            }else{
                mp2.put(p.charAt(i),mp2.get(p.charAt(i))+1);
            }
        }

        int right = 0;
        int left = 0;

        while(right<s.length()){
            if(!mp1.containsKey(s.charAt(right))){
                mp1.put(s.charAt(right),1);
            }else{
                mp1.put(s.charAt(right),mp1.get(s.charAt(right))+1);
            }
            if(right-left+1>p.length()){
                mp1.put(s.charAt(left),mp1.get(s.charAt(left))-1);
                if(mp1.get(s.charAt(left))==0){
                    mp1.remove(s.charAt(left));
                }
                left++;
            }
            if(mp1.equals(mp2)){
            result.add(left);
        }
        right++;
        }
        return result;
    }
}