class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr=0,max=0;
        for(int n:nums){
            if(n==1){
                curr++;
            }else{
                curr=0;
            }
            max=Math.max(curr,max);
        }
        return max;
    }
}