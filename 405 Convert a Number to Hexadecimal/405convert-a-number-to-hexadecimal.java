class Solution {
    public String toHex(int num) {

        if (num == 0) return "0";

        long n = num;
        if (n < 0) n = n + (1L << 32);

        String digits = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();

        
        while (n>0){
            int rem = (int)(n%16);
            sb.append(digits.charAt(rem));
            n = n/16;
        }
        return sb.reverse().toString();
    }
}