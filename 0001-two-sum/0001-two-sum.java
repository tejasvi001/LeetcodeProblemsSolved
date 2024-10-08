import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int arr1[]=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            arr1[k]=nums[k];
        }
        Arrays.sort(arr1);
        while(i<j){
            if(arr1[i]+arr1[j]==target){
                break;
            }else if(arr1[i]+arr1[j]>target){
                j--;
            }else{
                i++;
            }
        }
        int arr[]=new int[2];
        boolean checkedi=false,checkedj=false;
        if(i<j){
            for(int k=0;k<nums.length;k++){
                if(nums[k]==arr1[i]&&!checkedi){
                    arr[0]=k;
                    checkedi=true;
                    continue;
                 }
                if(nums[k]==arr1[j]&&!checkedj){
                    arr[1]=k;
                    checkedj=true;
                    continue;
                }
            }
        }
        return arr;
    }
}