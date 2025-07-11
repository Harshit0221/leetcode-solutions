class Solution {
    public int countDigits(int num) {
        int count = 0;
        int n=num;
        while(n>0){
        int lastdig = n%10;
        if (lastdig != 0 && num % lastdig==0) count ++;
        n=n/10;
        }
        
        return count;
    }
}