class Solution {
    public String largestOddNumber(String num) {
        int i = num.length()-1;
        int j = 0;
        while (i>=0){
            if ((num.charAt(i)-'0') %2 != 0){
                String result = num.substring(0,i+1);
                while (j<=num.length()-1 && num.charAt(j)==0){
                    j++;
                }
                return result.substring(j);
            }
            i--;
        }
        return "";
    }
}