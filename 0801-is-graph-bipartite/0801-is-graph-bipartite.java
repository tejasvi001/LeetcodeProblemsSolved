class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, -1); // Initially, all nodes are uncolored
        
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) { // Unvisited component
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                color[i] = 0;
                
                while (!queue.isEmpty()) {
                    int curr = queue.poll();
                    for (int neighbor : graph[curr]) {
                        if (color[neighbor] == -1) {
                            color[neighbor] = 1 - color[curr]; // Alternate color
                            queue.add(neighbor);
                        } else if (color[neighbor] == color[curr]) {
                            return false; // Same color on both sides = not bipartite
                        }
                    }
                }
            }
        }
        return true;
    }
}
