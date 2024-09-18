class Solution {
    private int r;
    private int c;
    int mymatrix[][];
    public void setZeroes(int[][] matrix) {
       r=matrix.length;
       c=matrix[0].length;
       mymatrix=new int[r][c];
       for(int i=0;i<r;i++)
           for(int j=0;j<c;j++)
                mymatrix[i][j]=1;
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(matrix[i][j]==0){
                   setRows(i);
                   setCols(j);
               }
           }
       }
       for(int i=0;i<r;i++)
                  for(int j=0;j<c;j++)
                        if(mymatrix[i][j]==0)
                                  matrix[i][j]=mymatrix[i][j];
    }
    public void setRows(int row){
         for(int i=0;i<c;i++){
             mymatrix[row][i]=0;
         }
    }
    public void setCols( int col){
        for(int i=0;i<r;i++){
            mymatrix[i][col]=0;
        }
    }
}