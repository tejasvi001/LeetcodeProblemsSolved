class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int count=1;
        int startRow=0,startCol=0, endRow=arr.length-1,endCol=arr[0].length-1;
		while(startRow<=endRow&&startCol<=endCol) {
			for(int i=startCol;i<=endCol;i++) {
				arr[startRow][i]=count++;
			}
			for(int i=startRow+1;i<=endRow;i++) {
				arr[i][endCol]=count++;
			}
            if(startRow<endRow)
			    for(int i=endCol-1;i>=startCol;i--) {
				    arr[endRow][i]=count++;
			    }
            if(startCol<endCol)
			    for(int i=endRow-1;i>startRow;i--) {
				    arr[i][startRow]=count++;
			    }
			startRow++;
			endRow--;
			startCol++;
			endCol--;
		}
        return arr;
    }
}