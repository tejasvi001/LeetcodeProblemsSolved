class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int b=0;
        while(a>0){
            int r=a%10;
            a/=10;
            b=b*10+r;
        }
        if(b==x){
            return true;
        }else{
            return false;
        }
    }
}