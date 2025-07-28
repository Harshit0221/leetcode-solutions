class Solution {
    public boolean isAnagram(String s1, String s2) {
     //   char[] arr1=str1.toCharArray();  //converting the strings to character array
     //   char[] arr2=str2.toCharArray();
     //   Arrays.sort(arr1);    //sorting the strings
     //   Arrays.sort(arr2);    //for ex:-bad =abd
     //   if(Arrays.equals(arr1,arr2)){
     //       return true;                     //if both the sorted arrays are equal then strings are anagram
     //   }else{
     //       return false;
     //   }
    Map <Character,Integer> mp = new HashMap <>();
       for (int i=0;i<s1.length();i++){
        if(!mp.containsKey(s1.charAt(i))) mp.put(s1.charAt(i),1);
        else{
            mp.put(s1.charAt(i),mp.get(s1.charAt(i))+1);
        }
       }

    Map <Character,Integer> mpp = new HashMap <>();
       for (int i=0;i<s2.length();i++){
        if(!mpp.containsKey(s2.charAt(i))) mpp.put(s2.charAt(i),1);
        else{
            mpp.put(s2.charAt(i),mpp.get(s2.charAt(i))+1);
        }
       }
       return mp.equals(mpp);
    }  
}