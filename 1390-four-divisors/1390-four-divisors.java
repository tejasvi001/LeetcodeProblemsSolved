class Solution {
    public int sumFourDivisors(int[] nums) {
        int s=0;
        for(int i:nums){
            s+=sum(i);
        }
        return s;
    }
    public int sum(int n){
        int c=1;
        int s=n;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                s+=i;
                 c++;
                 if(c>4){
                     return 0;
                 }
            }
            
        }
        if(c==4)
            return s;
        return 0;
    }
}