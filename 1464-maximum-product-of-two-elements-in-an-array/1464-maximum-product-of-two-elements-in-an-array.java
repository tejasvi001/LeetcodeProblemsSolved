class Solution {
    public int maxProduct(int[] nums) {
        int maxProd=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                maxProd=Math.max(maxProd,(nums[i]-1)*(nums[j]-1));
            }
        }
        return maxProd;
    }
}