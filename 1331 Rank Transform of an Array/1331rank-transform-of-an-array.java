class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int [] copy = new int [arr.length];
        for (int i=0;i<arr.length;i++){
            copy[i] = arr[i];
        }

        Arrays.sort(copy);
        HashMap <Integer,Integer> mp = new HashMap <>();
        int rank = 1;

        for (int num:copy){
            if(!mp.containsKey(num)){
                mp.put(num,rank);
                rank++;
            }
        }

        for (int i=0;i<arr.length;i++){
            arr[i] = mp.get(arr[i]);
        }

        return arr;
    }
}