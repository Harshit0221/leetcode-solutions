class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length()-1;
        int i = j;

        StringBuilder result = new StringBuilder();

        while (i>=0){
            while (i>=0 && s.charAt(i)!=' '){
                i--;
            }
            result.append(s.substring(i+1,j+1)).append(' ');
            while (i>=0 && s.charAt(i)==' ') i--;
            j=i;
        }
        return result.toString().trim();
        }
    }
