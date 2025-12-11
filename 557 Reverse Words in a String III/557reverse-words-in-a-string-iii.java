class Solution {
    public String reverseWords(String s) {
        Stack <Character> st = new Stack <>();
        StringBuilder sb = new StringBuilder ();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch!=' '){
                st.push(ch);
            }else {
                while (!st.isEmpty()){
                    sb.append(st.pop());
                }
                sb.append(' ');
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
}