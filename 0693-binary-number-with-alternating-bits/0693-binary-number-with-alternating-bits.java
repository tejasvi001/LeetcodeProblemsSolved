class Solution {
    public boolean hasAlternatingBits(int n) {
        int bit,lastbit=2;
        while(n>0){
            bit=(n&1);
            if(bit==lastbit){
                return false;
            }
            lastbit=bit;
            n=n>>1;
        }
        return true;
    }
}