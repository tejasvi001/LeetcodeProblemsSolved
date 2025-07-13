class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0,right=nums.length-1;
        int j=right;
        int res[]=new int[nums.length];
        while(j>=0){
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];
            if(left==right){
                res[j]=leftSquare;
            }else{
                if(leftSquare>rightSquare){
                res[j]=leftSquare;
                left++;
            }else{
                res[j]=rightSquare; 
                right--;
            }
            }
            
           
            j--;
        }
        return res;
    }
}