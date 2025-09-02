class Solution {
    public void reverseString(char[] s) {
        int m = 0, j = s.length-1;
       while (m<j){
            char temp = s[m];
            s[m] = s[j];
            s[j] = temp;
            m++;
            j--;
        }
    }
}