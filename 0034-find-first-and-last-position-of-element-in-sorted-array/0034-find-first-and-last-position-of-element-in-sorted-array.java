class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[1]=-1;
        arr[0]=-1;
        if(nums.length<1)
           return arr;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==target &&arr[0]==-1){
                 arr[0]=arr[1]=i;
           }
           if(nums[i]==target){
               arr[1]=i;
           }
           if(nums[i]>target){
               break;
           }
        }
        return arr;
    }
}