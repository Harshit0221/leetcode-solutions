class Solution {
    public String frequencySort(String s) {
        HashMap <Character,Integer> mp = new HashMap <>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                mp.put(ch,mp.get(ch)+1);
            }
        }

        StringBuilder sb = new StringBuilder ();
        int freq = s.length();

        while (freq>0){
            for (char j:mp.keySet()){
            if (mp.get(j)==freq){
                for (int k=0;k<freq;k++){
                    sb.append(j);
                }
            }
            }
          freq--;
        }
        return sb.toString();
    }
}