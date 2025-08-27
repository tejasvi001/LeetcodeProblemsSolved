
public class Solution {
    public int[] singleNumber(int[] nums) {
        int xxory = 0;
        
        // XOR all numbers
        for (int num : nums) {
            xxory ^= num;
        }

        // Get rightmost set bit
        int number = xxory & -xxory;

        int x = 0, y = 0;

        for (int num : nums) {
            if ((num & number) != 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }

        // Return sorted result (smaller first, bigger second)
        if (x > y) {
            return new int[]{y, x};
        } else {
            return new int[]{x, y};
        }
    }
}
