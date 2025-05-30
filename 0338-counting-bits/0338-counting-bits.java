class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            res[i]=bits(i);
        }
        return res;
    }
    public int bits(int n){
        int res=0;
        while(n>0){
            if((n&1)==1)
                res++;
            n=n>>1;
        }
        return res;
    }
}