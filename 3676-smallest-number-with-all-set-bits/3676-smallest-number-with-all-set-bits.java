class Solution {
    public int smallestNumber(int n) {
        if(n<=1){
            return 1;
        }
        //calculate n
        int x=1;
        for(int i=1;i<32;i++){
            if((n&(1<<i))!=0){
                x=i;
            }
        }
        //retun the max no.
        return (int) Math.pow(2,x+1)-1;

    }
}