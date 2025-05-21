class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = 0;
        double maxDiagonal = 0.0;

        for (int i = 0; i < dimensions.length; i++) {
            int curr_len = dimensions[i][0];
            int curr_width = dimensions[i][1];
            int curr_max = curr_len * curr_width;
            double curr_dia_len = Math.sqrt((curr_len * curr_len) + (curr_width * curr_width));
            if (curr_dia_len > maxDiagonal || (curr_dia_len == maxDiagonal && curr_max > max)) {
                maxDiagonal = curr_dia_len;
                max = curr_max;
            }
        }
        return max;
    }
}