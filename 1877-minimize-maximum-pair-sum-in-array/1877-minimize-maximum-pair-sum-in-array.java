class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int s=Integer.MIN_VALUE;
        for(int i=0;i<nums.length/2;i++){
            s=Math.max(s,(nums[i]+nums[n-i]));
        }
        return s;
    }
}