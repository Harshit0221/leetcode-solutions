class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int num = n;
        while (num>0){
            int lastDig = num%10;
            rev = rev*10+lastDig;
            num = num/10;
        }
        return Math.abs(n-rev);
    }
}