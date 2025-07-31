class Solution {
    public boolean isPalindrome(String str) {

        StringBuilder clean_str=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                clean_str.append(Character.toLowerCase(ch));
            }
        }
        String s=clean_str.toString();

        StringBuilder sb=new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        String s2=sb.toString();

        if(s2.equals(s)){
            return true;
        }else{
            return false;
        }


        
    }
    public void main(String args[]){
        String str="A man, a plan, a canal: Panama";

        isPalindrome(str);


    }
}