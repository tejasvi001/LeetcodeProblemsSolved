class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int i=Integer.MAX_VALUE,j=Integer.MAX_VALUE;
        for(int in=0;in<nums.length;in++){
            if(nums[in]<=i){
                i=nums[in];
            }else if(nums[in]<=j){
                j=nums[in];
            }else{
               return true;     
            }

        }
        // for(int i=0;i<nums.length-2;i++){
        //     for(int j=i+1;j<nums.length-1;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             if(nums[i]<nums[j]&&nums[j]<nums[k]){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        return false;
    }
}