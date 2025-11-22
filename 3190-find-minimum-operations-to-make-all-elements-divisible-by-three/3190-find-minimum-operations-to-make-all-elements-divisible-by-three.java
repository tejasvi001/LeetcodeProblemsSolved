class Solution {
    public int minimumOperations(int[] nums) {
        int i=0;
        for(int n:nums){
            if(n%3!=0) i++;
        }
        return i;
    }
}