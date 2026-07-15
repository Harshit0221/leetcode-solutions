class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxCount = Integer.MIN_VALUE;
        for (int i=0;i<sentences.length;i++){
            int count = 0;
            String sen = sentences[i];
            for (int j=0;j<sen.length();j++){
                if (sen.charAt(j)==' '){
                    count++;
                }
                maxCount = Math.max(count+1,maxCount);
            }
        }
        return maxCount;
    }
}