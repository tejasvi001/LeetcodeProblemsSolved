class Solution {
    public int climbStairs(int n) {
        int arr[]=new int[n+1];
        return climb(n,arr);
    }
    private int climb(int n,int arr[]){
        if(n<=2){
            arr[n]=n;
            return arr[n];
        }
        if(arr[n]!=0){
            return arr[n];
        }
        arr[n]=climb(n-1,arr)+climb(n-2,arr);
        return arr[n];
    }
}