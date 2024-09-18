class Solution {
    public int maxArea(int[] height) {
       int max=Integer.MIN_VALUE;
		int lp=0;
		int rp=height.length-1;
		while(lp<rp) {
			int w=rp-lp;
			int h=Math.min(height[rp], height[lp]);
			max=Math.max(max, h*w);
			if(height[lp]<height[rp]) {
				lp++;
			}
			else {
				rp--;
			}
		}
		return max;
    }
}