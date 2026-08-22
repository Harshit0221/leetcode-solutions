class Solution {
    public boolean checkDivisibility(int n) {
        
        int num = n;
        int sum = 0;
        int prod = 1;

        while (num>0){
            int lastDig = num % 10;
            sum = sum + lastDig;
            prod = prod * lastDig;
            num = num / 10;
        }
        int x = sum + prod;

        return (n % x == 0);
        
    }
}