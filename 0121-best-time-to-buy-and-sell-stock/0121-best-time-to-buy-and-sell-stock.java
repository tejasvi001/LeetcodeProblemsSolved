class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit=0;
		int bp=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++) {
			bp=Math.min(arr[i-1], bp);
			maxProfit=Math.max(maxProfit, (arr[i]-bp));
			}
		return maxProfit;
    }
}