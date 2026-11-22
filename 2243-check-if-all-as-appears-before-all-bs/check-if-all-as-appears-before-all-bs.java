class Solution {
    public boolean checkString(String s) {
        for (int j = 1; j < s.length(); j++) {
            if (s.charAt(j) == 'a' && s.charAt(j - 1) == 'b') {
                return false;
            }
        }
        return true;
    }
}
