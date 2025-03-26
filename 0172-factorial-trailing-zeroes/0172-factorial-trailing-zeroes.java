class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        for(int i=5;i<=n;i+=5){
            c++;
            int a=i/5;
            while(a%5==0){
                c++;
                a/=5;
            }
        }
        return c;
    }
}