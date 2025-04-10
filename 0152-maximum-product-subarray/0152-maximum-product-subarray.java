class Solution {
    public int maxProduct(int[] arr) {
         int currMax=arr[0];
        int currMin=arr[0];
        int maxProd=arr[0];
        int temp;
        for(int i=1;i<arr.length;i++){
            
            temp=Math.max(arr[i],Math.max(arr[i]*currMax,arr[i]*currMin));
            currMin=Math.min(arr[i],Math.min(arr[i]*currMax,arr[i]*currMin));
            currMax=temp;
            maxProd=Math.max(maxProd,currMax);
        }
        return maxProd;
    }
}