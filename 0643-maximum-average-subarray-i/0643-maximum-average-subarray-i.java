class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        int gms=s;
        for(int i=k;i<nums.length;i++){
            s-=nums[i-k];
            s+=nums[i];
            gms=Math.max(s,gms);
        }
        double r=gms;
        return r/k;
    }
}