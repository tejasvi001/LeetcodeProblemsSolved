class Solution {
    public int findLongestChain(int[][] pairs) {
        int pair=0;
		pair++;
		Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));
		int lastEnd=pairs[0][1];
		for(int i=1;i<pairs.length;i++) {
			if(pairs[i][0]>lastEnd) {
				pair++;
				lastEnd=pairs[i][1];
			}
		}
		return pair;
    }
}