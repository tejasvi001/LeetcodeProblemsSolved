class Solution {
    public int minMovesToSeat(int[] a, int[] b) {
      Arrays.sort(a);
		Arrays.sort(b);
		int diff=0;
		for(int i=0;i<a.length;i++) {
			diff+=Math.abs(a[i]-b[i]);
		}
		return diff;
    }
}