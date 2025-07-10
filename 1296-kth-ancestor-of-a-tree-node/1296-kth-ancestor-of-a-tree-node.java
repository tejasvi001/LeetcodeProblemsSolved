class TreeAncestor {
    // ancestor[r][i] : 2^r-th ancestor or node i;
    int[][] ancestors;
    int rows;
    
    // initialization: Time: n * log(n)   Space: n * log(n) 
    public TreeAncestor(int n, int[] parent) {
        this.rows = (int)(Math.log(n) / Math.log(2)) + 1;
        this.ancestors = new int[rows][n];

        
        ancestors[0] = parent;
        for (int r = 1; r < rows; r++) {
            for (int i = 0; i < n; i++) {
                int temp = ancestors[r-1][i];
                ancestors[r][i] = (temp == -1) ? -1 : ancestors[r-1][temp];
            }
        } 
    }
    
    public int getKthAncestor(int node, int k) {
        int r = 0;
        while (k > 0) {
            if ((k & 1) == 1) node = ancestors[r][node];
            if (node == -1) break;
            
            r++;
            k >>= 1;
        }
        
        return node;
    }
}