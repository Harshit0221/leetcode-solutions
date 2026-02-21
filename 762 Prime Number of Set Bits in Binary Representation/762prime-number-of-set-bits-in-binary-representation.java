class Solution {
    
    public int countPrimeSetBits(int left, int right) {
        int fCount = 0;

        for (int i = left; i <= right; i++) {

            int num = i;   // use temporary variable
            int count = 0;

            // Count set bits using Brian Kernighan's algorithm
            while (num > 0) {
                num = num & (num - 1);
                count++;
            }

            if (isPrime(count)) {
                fCount++;
            }
        }

        return fCount;
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}