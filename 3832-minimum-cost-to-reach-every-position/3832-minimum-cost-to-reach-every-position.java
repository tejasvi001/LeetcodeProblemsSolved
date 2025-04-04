class Solution {
    public int[] minCosts(int[] cost) {
        int res[]=new int[cost.length];
        res[0]=cost[0];
        for(int i=1;i<cost.length;i++){
            res[i]=Math.min(res[i-1],cost[i]);
        }
        return res;
    }
}