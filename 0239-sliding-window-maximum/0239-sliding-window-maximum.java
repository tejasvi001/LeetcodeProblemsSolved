class Solution {
    class Info implements Comparable<Info>{
		int index;
		int val;
		Info(int index,int val){
			this.index=index;
			this.val=val;
		}
		@Override
		public int compareTo(Info o) {
			// TODO Auto-generated method stub
			return this.val-o.val;
		}
		
	}
    public int[] maxSlidingWindow(int[] arr, int k) {
        int res[]=new int[arr.length-k+1];
		PriorityQueue<Info> pq=new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<k;i++) {
			pq.add(new Info(i,arr[i]));
		}
		res[0]=pq.peek().val;
		for(int i=k;i<arr.length;i++) {
			while(!pq.isEmpty()&&pq.peek().index<=i-k) {
				pq.remove();
			}
			pq.add(new Info(i,arr[i]));
			res[i-k+1]=pq.peek().val;
		}
		return res;
    }
}