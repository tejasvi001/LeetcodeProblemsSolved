class Solution {
    public int numSpecial(int[][] mat) {
        int c=0;
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    boolean isSpecial=true;
                    for(int k=0;k<mat[0].length;k++){
                        if(mat[i][k]==1&&k!=j){
                            isSpecial=false;
                        }
                    }
                    for(int k=0;k<mat.length;k++){
                        if(mat[k][j]==1&&k!=i){
                            isSpecial=false;
                        }
                    }
                    if(isSpecial){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}