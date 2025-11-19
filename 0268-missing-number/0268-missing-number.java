class Solution {
    public int missingNumber(int[] nums) {
    // int ret = 0;
    // for(int i = 0; i < nums.length; ++i) {
    //     ret ^= i;
    //     ret ^= nums[i];
    // }
    // return ret^=nums.length;
    int n=nums.length;
    int sum=n*(n+1)/2;
    for(int i=0;i<nums.length;i++){
        sum-=nums[i];
    }
    return sum;
    }
}