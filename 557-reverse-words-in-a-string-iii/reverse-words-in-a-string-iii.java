class Solution {
    public String reverseWords(String s) {
        // Stack <Character> st = new Stack <>();
        // StringBuilder sb = new StringBuilder ();
        // for (int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if (ch!=' '){
        //         st.push(ch);
        //     }else {
        //         while (!st.isEmpty()){
        //             sb.append(st.pop());
        //         }
        //         sb.append(' ');
        //     }
        // }
        // while (!st.isEmpty()) {
        //     sb.append(st.pop());
        // }
        // return sb.toString();

        char[] arr = s.toCharArray();
        int start = 0;

        for (int i=0;i<=arr.length;i++){
            if (i == arr.length || arr[i] == ' '){
                reverse(arr,start,i-1);
                start = i+1;
            }
        }
        return new String(arr);

    }

    public void reverse(char[] arr, int start, int end){
        while (start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}