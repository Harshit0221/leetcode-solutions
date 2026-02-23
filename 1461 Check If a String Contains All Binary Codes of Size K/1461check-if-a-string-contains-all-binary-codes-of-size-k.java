class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        int total = (int)Math.pow(2,k);
        if (n - k + 1 < total) return false;
        HashSet <String> set = new HashSet <>();
        for (int i=0;i<=n-k;i++){
            set.add(s.substring(i,i+k));
        }
        if (set.size()==total){
            return true;
        }
        return false;
    }
}