class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean flag=false;
        do{
            if(search(nums,original)){
                original*=2;
                flag=true;;
            }else{
                flag=false;
            }
        }while(flag);
        return original;
    }
    boolean search(int[] nums,int x){
        for(int i:nums)
            if(i==x)
                return true;
        return false;
    }
}