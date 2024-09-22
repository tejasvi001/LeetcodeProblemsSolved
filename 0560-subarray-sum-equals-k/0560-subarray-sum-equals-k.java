class Solution {
    public int subarraySum(int[] nums, int k) {
           int n=0;
           int s=0;
           int prefix[]=new int[nums.length];
           prefix[0]=nums[0];
           for(int i=1;i<nums.length;i++)
                prefix[i]=prefix[i-1]+nums[i];
           for(int i=0;i<nums.length-1;i++){
                             for(int j=i+1;j<nums.length;j++){
                                     s=prefix[j]-prefix[i];
                                     if(s==k)
                                           n++;
                }
           } 
           for(int i=0;i<prefix.length;i++)
                if(prefix[i]==k)
                    n++;


                                                                                     
           return n; 
    }
}