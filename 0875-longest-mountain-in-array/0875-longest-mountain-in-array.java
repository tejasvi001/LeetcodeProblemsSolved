class Solution {
    public int longestMountain(int[] arr) {
        int max = 0;
        int n = arr.length;

        for (int i = 1; i < n - 1; i++) {
            // Check if current element is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i;
                int right = i;

                // Expand to the left
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // Expand to the right
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                // Update maximum mountain length
                max = Math.max(max, right - left + 1);

                // Optional optimization: skip checked part
                i = right;
            }
        }

        return max;
    }
}
