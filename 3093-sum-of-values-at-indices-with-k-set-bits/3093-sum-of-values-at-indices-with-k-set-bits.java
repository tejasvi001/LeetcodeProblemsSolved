class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        int i=0;
        for(Integer x:nums){
            if(countBits(i)==k)
                sum+=x;
            i++;
        }
        return sum;
    }
    public int countBits(int n){
        int c=0;
        while(n>0){
            if((n&1)==1)    
                c++;
            n=n>>1;
        }
        return c;
    }
}