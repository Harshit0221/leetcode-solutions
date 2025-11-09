class Solution {
    public boolean isIsomorphic(String s, String t) {
        // HashMap <Character,Character> mp = new HashMap<>();

        // for (int i=0;i<s.length();i++){
        //     Character sCh=s.charAt(i);
        //     Character tCh=t.charAt(i);
        //     if(mp.containsKey(sCh)){
        //         if(mp.get(sCh)!=tCh) return false;
        //     }else if(mp.containsValue(tCh)) {
        //         return false;
        //     }else{
        //         mp.put(sCh,tCh);
        //     }
        // }
        // return true;


        //2nd method
        HashMap <Character,Integer> mp1 = new HashMap <>();
        HashMap <Character,Integer> mp2 = new HashMap <>();

        for (int i=0;i<s.length();i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if (!mp1.containsKey(sch)) mp1.put(sch,i);
            if (!mp2.containsKey(tch)) mp2.put(tch,i);

            if(mp1.get(sch)!=mp2.get(tch)) return false;
        }
        return true;
    }
} 


// containskey check whether anything is present as a key in hashmap
// containsValue checks wjether something in present as a value in hashmap