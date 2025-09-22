class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startrow = 0;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;

        List<Integer> result = new ArrayList<>();

        while (startrow <= endrow && startcol <= endcol){
            for (int i=startcol;i<=endcol;i++){
                result.add (matrix[startrow][i]);
            }
            for (int i=startrow+1;i<=endrow;i++){
                result.add (matrix[i][endcol]);
            }
            for (int i=endcol-1;i>=startcol;i--){
                if (startrow == endrow) break;
                result.add (matrix[endrow][i]);
            }
            for (int i=endrow-1;i>=startrow+1;i--){
                if (startcol == endcol) break;
                result.add (matrix[i][startcol]);
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return result;
    }
}