class Solution {
    public int lengthOfLastWord(String s) {
    String str=s.trim();    //used to remove starting or ending empty spaces
    int count=0;
    for(int i=str.length()-1;i>=0;i--){
      if(str.charAt(i)!=' '){
        count++;
      }else{
        break;
      }
    }
    return count;
    }
    public void main(String[] args) {
    String s="hello world";
    System.out.println(lengthOfLastWord(s));
  }
}