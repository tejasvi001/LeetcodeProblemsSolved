class Solution {
    public int maxDistance(int[] A, int[] B) {
            int i = 0, j = 0; // initialize both pointers at the 0th index.

    while (i < A.length && j < B.length) {
        // If invalid:
        // move i right to restore a valid pair.
        if (A[i] > B[j])
            i++;

        // Move j right to maximize j - i.
        j++;
    }

    // j - i is the farthest gap reached so far;
    // subtract 1 since j is one step past it.
    return Math.max(0, j - i - 1); // Distance cannot be negative.
    }
}