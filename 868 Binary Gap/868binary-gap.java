class Solution {
    public int binaryGap(int n) {
        StringBuilder sb = new StringBuilder ();
        while (n>0){
            int rem = n % 2;
            sb.append(rem);
            n = n / 2;
        }
        String bin = sb.reverse().toString();
        int j = 0;
        int maxCount = 0;
        for (int i=1;i<=bin.length()-1;i++){
            if (bin.charAt(i)=='1'){
                int count = i-j;
                maxCount = Math.max(count,maxCount);
                j=i;
            }
        }
        return maxCount;
    }
}