class Solution {
    public int countPalindromicSubsequence(String s) {

        HashMap <Character,int[]> mp = new HashMap <>();

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,new int[]{i,i});
            }else{
                mp.get(ch)[1] = i;
            }
        }

        int count = 0;
        for (var j:mp.entrySet()){
            int [] range = j.getValue();
            if(range[0]==range[1]) continue;

            HashSet <Character> set = new HashSet <>();
            for (int i=range[0]+1;i<range[1];i++){
                set.add(s.charAt(i));
            }
            count += set.size();
        }
        return count;
    }
}