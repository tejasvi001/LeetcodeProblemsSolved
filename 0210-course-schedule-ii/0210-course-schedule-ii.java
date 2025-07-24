class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];

        // Initialize graph
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph and compute indegree
        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];
            graph.get(prereq).add(course);
            indegree[course]++;
        }

        // Queue for courses with 0 indegree
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0)
                queue.offer(i);
        }

        int finishedCourses[] = new int[numCourses];
        int i=0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            finishedCourses[i++]=current;
            for (int neighbor : graph.get(current)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0)
                    queue.offer(neighbor);
            }
        }
        if (i != numCourses)
            return new int[0];
        return finishedCourses;
    }
}