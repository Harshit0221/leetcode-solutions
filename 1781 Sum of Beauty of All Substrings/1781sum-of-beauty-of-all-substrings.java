class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0;

        for (int i=0;i<n;i++){
            HashMap <Character,Integer> mp = new HashMap <>();

            for (int j=i;j<n;j++){
                char ch = s.charAt(j);
                if(!mp.containsKey(ch)) mp.put(ch,1);
                else{
                    mp.put(ch,mp.get(ch)+1);
                }

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for (int k:mp.values()){
                    maxFreq = Math.max(maxFreq,k);
                    minFreq = Math.min(minFreq,k);
                }
                ans = ans + (maxFreq-minFreq);
            }
        }
        return ans;
    }
}