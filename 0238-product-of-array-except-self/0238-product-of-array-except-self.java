class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int prodarr[]=new int[nums.length];
        boolean flag=true;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            if(nums[i]==0){
                flag=false;
                break;
            }
        }
        if(flag){
            for(int i=0;i<nums.length;i++){
                prodarr[i]=prod/nums[i];
            }
        }else{
        for(int i=0;i<nums.length;i++){
            prod=1;
            for(int j=0;j<nums.length;j++){
               if(i!=j) prod*=nums[j];
            }
            prodarr[i]=prod;
        }
        }
        return prodarr;
    }
}