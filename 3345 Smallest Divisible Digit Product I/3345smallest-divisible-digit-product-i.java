class Solution {
    private int sumOfDigits (int x){
        int prod = 1;
        while (x>0){
            int lastDig = x%10;
            prod = prod*lastDig;
            x = x/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        for (int i=n; ;i++){
            int ans = sumOfDigits(i);
            if (ans%t==0){
                return i;
            }
        }
        // return 0;
    }
}