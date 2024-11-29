class RecentCounter {
    Queue<Integer> queue=new LinkedList<>();
    public RecentCounter() {
        queue.clear();

    }
    
    public int ping(int t) {
        queue.add(t);
        int c=0;
        for(Integer x: queue){
            if(x<=t&&x>=t-3000){
                c++;
            }
        }
        return c;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */