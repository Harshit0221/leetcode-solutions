class Solution {
    public boolean findRotation(int[][] matrix, int[][] target) {
        for(int k = 0;k<4;k++){
            if (Arrays.deepEquals(matrix,target)) return true;
            rotate(matrix);
        }
          return false;
    }
    
         void rotate(int[][] matrix) {
        int n = matrix.length;
            transpose(matrix,n);
            for (int i=0;i<n;i++){
                reverse(matrix[i]);

            }
    }  
         void transpose (int matrix[][],int n){
           for (int i =0;i<n;i++){
            for (int j =i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
           }
        }
        void reverse (int [] arr){
            int i =0,j=arr.length-1;
            while(i<j){
                int temp =arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                i++;
                j--;
            }
        }
    }
