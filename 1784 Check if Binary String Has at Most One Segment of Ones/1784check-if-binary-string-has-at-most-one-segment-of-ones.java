class Solution {
    public boolean checkOnesSegment(String s) {
        // int count = 0;
        if (s.equals("1")) return true;
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)=='1' && s.charAt(i-1)=='0'){
                return false;
            }
        }
        return true;
    }
}