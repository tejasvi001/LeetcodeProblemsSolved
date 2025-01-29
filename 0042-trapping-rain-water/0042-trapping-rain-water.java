class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftMax[]=new int[n];
        leftMax[0]=0;
        int rightMax[]=new int[n];
        rightMax[n-1]=0;
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i+1]);
        }
        int water=0;
        int trap;
        for(int i=0;i<n;i++){
            trap=Math.min(leftMax[i],rightMax[i])-height[i];
            if(trap>0)
                water+=trap;
        }
        return water;
    }
}