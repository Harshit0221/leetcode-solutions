class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack <>();
        int n = s.length();
        for (int i=0;i<n;i++){
            char ch = s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else{
                if(st.size()==0) return false;
                if ((ch == ')' && st.peek() == '(') ||
                    (ch == '}' && st.peek() == '{') ||
                    (ch == ']' && st.peek() == '[')) {
                    st.pop();
               }else{
                return false;
                }
            }  
    }
    return st.isEmpty();
}
}



//agar opening bracket dikhe toh stack mei push kar do
//agar closing bracket dikhe :
    // 1. agar top pe opening bracket hai toh use pop karte jao end mei agar empty stack bacha toh return true.
    // 2. agar bich mei kahi bhi stack empty ho gya toh return false because phir kabhi bhi pattern complete ho hee nhi sakta