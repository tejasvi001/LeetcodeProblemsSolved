class Solution {
    public int removeElement(int[] nums, int val) {
        int ndi=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==val){
                i++;
            }else{
                nums[ndi++]=nums[i++];
            }
        }
        return ndi;
    }
}