class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int largest = Integer.MIN_VALUE;
        for (int i=0;i<candies.length;i++){
            largest = Math.max(largest,candies[i]);
        }

        ArrayList <Boolean> result = new ArrayList <>();
        for (int i=0;i<candies.length;i++){
            int x = candies[i];
            if (x+extraCandies >= largest){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}