class Solution {
    public int maximizeSum(int[] nums, int k) {
         int max=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
         }
        int ans=max;
        for(int i=1;i<k;i++){
            ans+=(max+i);
        }
        return ans;
    }
}