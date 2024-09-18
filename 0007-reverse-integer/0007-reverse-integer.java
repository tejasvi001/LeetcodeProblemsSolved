class Solution {
    public int reverse(int x) {
        if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE){
            return 0;
        }
        int a=x;
        long b=0;
        if(a>0){
        while(a>0){
            int r=a%10;
            a/=10;
            b=b*10+r;
        }
        }
        else{
            
            a*=(-1);
        
        while(a>0){
            int r=a%10;
            a/=10;
            b=b*10+r;
        }
        b*=(-1);
        }
        if(b>Integer.MAX_VALUE||b<Integer.MIN_VALUE){
            return 0;
        }
        return (int)b;
    }
}