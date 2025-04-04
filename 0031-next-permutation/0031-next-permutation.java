class Solution {
    public void nextPermutation(int[] nums) {
        int t, idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(nums,0, nums.length-1);
        }else{
            for(int i=nums.length-1;i>idx;i--){
                if(nums[i]>nums[idx]){
                    t=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=t;
                    break;
                }
            }
            reverse(nums,idx+1,nums.length-1);
        }
    }
    private void reverse(int arr[], int start, int end){
        int t;
        while(start<end){
            t=arr[start];
            arr[start++]=arr[end];
            arr[end--]=t;
        }
    }
}