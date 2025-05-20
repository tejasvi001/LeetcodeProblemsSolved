class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int diff[]=new int[nums.length+1];
        for(int[] q:queries){
            diff[q[0]]++;
            if(q[1]+1<nums.length)
                diff[q[1]+1]--;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=diff[i];
            if(sum<nums[i])
                return false;
        }
        return true;
    }
}