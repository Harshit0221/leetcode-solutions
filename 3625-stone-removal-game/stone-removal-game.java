class Solution {
    public boolean canAliceWin(int n) {
        if (n<10) return false;
        if (n>=10 && n<19) return true;

        int count = 0;
        int x = 10;
        while (n>=x){
            n = n-x;
            count++;
            x--;
        }

        if (count%2==0){
            return false;
        }
        return true; 
    }
}