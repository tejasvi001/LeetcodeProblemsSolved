class Solution {
    public int maxProfit(int[] prices) {
        int bp=Integer.MAX_VALUE;
        int mp=0;
        for(int i=0;i<prices.length;i++){
            bp=Math.min(bp,prices[i]);
            mp=Math.max(mp,prices[i]-bp);
        }
        return mp;
    }
}