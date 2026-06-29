class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n = word.length();
        int count = 0;
        for (int i=0;i<patterns.length;i++){
            String str = patterns[i];
            int m = patterns[i].length();
            for (int j=0;j<=n-m;j++){
                int k = 0;
                while (k<m && word.charAt(j+k) == str.charAt(k)){
                    k++;
                }
                if (k==m){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}