class Solution {
    public String longestCommonPrefix(String[] str) {
    //   Arrays.sort(str);
    //   String str1=str[0];
    //   String str2=str[str.length-1];
    //   int i=0;
    //   while(i<str1.length()){
    //     if(str1.charAt(i)==str2.charAt(i)){
    //       i++;
    //     }else{
    //       break;
    //     }
    //   }
    //   return i==0?"":str1.substring(0,i);

    if (str == null || str.length == 0) {
            return "";
        } 

    int minLen = str[0].length();  
    for(int i=1;i<str.length;i++){   
        if (str[i].length() < minLen) {
            minLen = str[i].length();
        }                              
    } 

    StringBuilder sb = new StringBuilder ();

    for (int i=0;i<minLen;i++){
        char ch = str[0].charAt(i);

        for (int j=1;j<str.length;j++){
            if(str[j].charAt(i)!=ch){  // mismatch found
               return sb.toString();
            } 
        }
        sb.append(ch); 
    }    
    return sb.toString();
    }
}