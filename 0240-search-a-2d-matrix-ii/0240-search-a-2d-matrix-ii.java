class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalcol = matrix[0].length;
        int row = 0;
        int col = totalcol-1;

        while(row<totalRow && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return false;

        
    }
}