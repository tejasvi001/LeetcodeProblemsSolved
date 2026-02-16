import java.util.*;

class Solution {

    class Info implements Comparable<Info> {
        int index;
        int score;

        Info(int index, int score) {
            this.index = index;
            this.score = score;
        }

        @Override
        public int compareTo(Info other) {
            // Max heap (higher score first)
            return other.score - this.score;
        }
    }

    public String[] findRelativeRanks(int[] score) {

        PriorityQueue<Info> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.add(new Info(i, score[i]));
        }

        String[] arr = new String[score.length];
        int rank = 1;

        while (!pq.isEmpty()) {
            Info info = pq.remove();
            arr[info.index] = getRank(rank++);
        }

        return arr;
    }

    public String getRank(int rank) {
        switch (rank) {
            case 1:
                return "Gold Medal";
            case 2:
                return "Silver Medal";
            case 3:
                return "Bronze Medal";
            default:
                return String.valueOf(rank);
        }
    }
}
