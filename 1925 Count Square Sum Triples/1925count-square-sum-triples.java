class Solution {
    public int countTriples(int n) {
        // int count = 0;
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=n;j++){
        //         int c2 = i*i + j*j;
        //         int c = (int) Math.sqrt(c2);
        //         if (c*c==c2 && c<=n) count++;
        //     }
        // }
        // return count;

        int count = 0;
        HashSet <Integer> set = new HashSet <>();
        for (int i=1;i<=n;i++){
            set.add(i*i);
        }

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                int c = i*i + j*j;
                if(set.contains(c)) count++;
            }
        }
        return count;
    }
}