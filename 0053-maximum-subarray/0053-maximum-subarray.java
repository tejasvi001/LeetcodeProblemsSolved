class Solution {
    public int maxSubArray(int[] nums) {
        //kadane s algorithm
        if(nums.length<=1){
            return nums[0];
        }
        int localsum=0;
        int globalsum=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            localsum=Math.max(localsum+nums[i],nums[i]);
            globalsum=Math.max(globalsum,localsum);
        }
        return globalsum;
    }
}