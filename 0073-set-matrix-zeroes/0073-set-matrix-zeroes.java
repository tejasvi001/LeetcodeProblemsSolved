class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isZero[][]=new boolean[matrix.length][matrix[0].length];
        int i,j;
        for(i=0;i<matrix.length;i++){
            for( j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    setRowZero(isZero,i);
                    setColZero(isZero,j);
                }
            }
        }
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                if(isZero[i][j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public void setRowZero(boolean matrix[][],int row){
        for(int i=0;i<matrix[0].length;i++){
            matrix[row][i]=true;
        }
    }
     public void setColZero(boolean matrix[][],int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col]=true;
        }
    }
}