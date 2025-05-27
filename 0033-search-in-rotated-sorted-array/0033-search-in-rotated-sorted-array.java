class Solution {
    public int search(int[] nums, int target) {
        return searchRecursive(nums,target,0,nums.length-1);
    }
    public int searchRecursive(int arr[],int target,int si,int ei) {
		if(si>ei) {
			return -1;
		}
		int mid=si+(ei-si)/2;
		if(arr[mid]==target) {
			return mid;
		}
			//line 1
		if(arr[mid]>=arr[si]) {
			if(arr[si]<=target&&target<=arr[mid]) {
				return searchRecursive(arr,target,si,mid-1);
			}else {
				return searchRecursive(arr,target,mid+1,ei);
			}
		}else {
			if(arr[ei]>=target&&target>=arr[mid]) {
				return searchRecursive(arr,target,mid+1,ei);
			}
			else {
				return searchRecursive(arr,target,si,mid-1);
			}
		}
		
	}
}