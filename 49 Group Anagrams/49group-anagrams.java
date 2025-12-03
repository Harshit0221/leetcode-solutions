class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap <String,ArrayList<String>> mp = new HashMap <>();
        
        for (int i=0;i<strs.length;i++){
            String s = strs[i];

            char [] arr = s.toCharArray();

            Arrays.sort(arr);

            String key = new String (arr);

            if (!mp.containsKey(key)){
                ArrayList <String> result = new ArrayList <>();
                mp.put(key,result);
            }

            mp.get(key).add(s);
        }
        return new ArrayList <> (mp.values());
    }
}