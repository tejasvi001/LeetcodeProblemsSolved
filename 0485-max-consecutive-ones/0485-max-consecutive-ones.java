class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int m=0;
        for(int x:nums){
            if(x==1){
                c++;
            }else{
                m=Math.max(c,m);
                c=0;
            }
        } 
        m=Math.max(c,m);
        return m;
    }
}