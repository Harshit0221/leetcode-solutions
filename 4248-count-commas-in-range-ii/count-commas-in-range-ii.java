class Solution {
    public long countCommas(long n) {
        if (n<1000) return 0;
        if (n>1000 && n<100000) return n-999;
        long count = 0;
        for (long i=1000;i<=n;i*=1000){
            count += n-i+1;
        }
        return count;
    }
}