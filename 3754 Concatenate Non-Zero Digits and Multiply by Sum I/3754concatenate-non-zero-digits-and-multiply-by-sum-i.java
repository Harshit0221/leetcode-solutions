class Solution {
    public long sumAndMultiply(int n) {
        // long num = n;
        // long x = 0;
        // long sum = 0;
        // while (num>0){
        //     long lastDig = num%10;
        //     if (lastDig!=0){
        //         x = (long)x*10 + lastDig;
        //     }
        //     sum = sum + lastDig;
        //     num = num / 10;
        // }

        // long y = x;
        // long rev = 0;
        // while (y>0){
            
        //     long lastDig1 =  y%10;
        //     rev = rev*10 + lastDig1;
        //     y = y/10;
        // }
        // return rev*sum;

        String str = String.valueOf(n);

        long concat = 0;
        long sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != '0') {
                long digit = ch - '0';
                concat = concat * 10 + digit;
                sum += digit;
            }
        }

        return concat * sum;
    }
}