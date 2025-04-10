class Solution {
    public int removeDuplicates(int[] arr) {
        int ndi=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[ndi++]=arr[i];
            }
        }  
        return ndi;
    }
}