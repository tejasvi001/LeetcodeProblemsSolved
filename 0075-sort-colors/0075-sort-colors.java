class Solution {
    public void sortColors(int[] nums) {
        int length=nums.length;
        if(length<=1){
            return;
        }
        int mid=length/2;
        int left[]=new int[mid];
        for(int i=0;i<mid;i++)
            left[i]=nums[i];
        int right[]=new int[length-mid];
        for(int i=mid;i<length;i++){
            right[i-mid]=nums[i];
        }
        sortColors(left);
        sortColors(right);
        merge(nums,left,right);
    }
    public void merge(int nums[],int left[],int right[]){
        int ll=left.length;
        int rl=right.length;
        int i=0,j=0,k=0;
        while(i<ll&&j<rl){
            if(left[i]<right[j]){
                nums[k]=left[i];
                i++;
            }
            else{
                nums[k]=right[j];
                j++;
            }
            k++;
        }
    
    while(i<ll){
        nums[k]=left[i];
        i++;
        k++;
    }
    while(j<rl){
        nums[k]=right[j];
        j++;
        k++;
    }
    }
}