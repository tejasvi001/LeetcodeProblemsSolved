class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=0;
        Arrays.sort(nums);
        int l=0, r=nums.length-1;
        int s;
        while(l<r){
            s=nums[l]+nums[r];
            if(s>k){
                r--;
            }else if(s<k){
                l++;
            }else{
                n++;
                l++;
                r--;
            }
        }
        return n;
        }
}