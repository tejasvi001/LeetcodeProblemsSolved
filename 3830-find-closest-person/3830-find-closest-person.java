class Solution {
    public int findClosest(int x, int y, int z) {
        int n1=Math.abs(z-x);
        int n2=Math.abs(z-y);
        if(n1<n2){
            return 1;
        }else if(n2<n1){
            return 2;
        }
        return 0;
    }
}