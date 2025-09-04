class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {   // stop when we reach 1 (happy) or 4 (cycle starts)
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum = sum + (digit * digit);
                n = n / 10;  // reduce n
            }
            n = sum; // update n for next round
        }
        return n == 1;
    }
}
