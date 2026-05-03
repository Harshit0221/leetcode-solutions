class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}


// If you concatenate the string s with itself (i.e., s + s),
// then any possible rotation of s will appear as a substring inside it.