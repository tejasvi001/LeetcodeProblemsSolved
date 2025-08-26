class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
       double diagonal=0.0;
       int idx=-1;
       for(int i=0;i<dimensions.length;i++){
            double diagonal1=Math.sqrt(dimensions[i][0]*dimensions[i][0]+ dimensions[i][1]*dimensions[i][1]);
            if(diagonal1>diagonal){
                idx=i;
                diagonal=diagonal1;
            }
       }
       return dimensions[idx][0]*dimensions[idx][1];
    }
}