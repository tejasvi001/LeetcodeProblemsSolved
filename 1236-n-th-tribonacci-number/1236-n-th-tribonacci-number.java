class Solution {
    public int tribonacci(int n) {
        int [] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        return triDp(dp,n);
    }

    static int triDp(int []dp,int n){
         if(n==1||n==0){
            return n;
        }
        if(n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
       dp[n]= triDp(dp,n-1)+triDp(dp,n-2)+triDp(dp,n-3);
       return dp[n];
    }
}