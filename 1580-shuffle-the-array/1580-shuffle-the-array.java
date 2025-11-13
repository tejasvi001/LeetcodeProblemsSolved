class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=nums[i];
        }
        for(int i=n;i<2*n;i++){
            arr2[i-n]=nums[i];
        }
        int i=0,k=0;
        while(i<n){
            nums[k++]=arr1[i];
            nums[k++]=arr2[i++];
        }
        return nums;
    }
}