class Solution {
    public void moveZeroes(int[] nums) {
        int zeroes=0;
        int nzi=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==0){
                zeroes++;
            }else{
                nums[nzi++]=nums[i];
            }
            i++;
        }
        while(zeroes>0){
            nums[nzi++]=0;
            zeroes--;
        }
    }
}
