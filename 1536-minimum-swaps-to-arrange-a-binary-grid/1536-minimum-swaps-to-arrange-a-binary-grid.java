class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] trailingZeros = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0) count++;
                else break;
            }
            trailingZeros[i] = count;
        }

        int swaps = 0;

        for (int i = 0; i < n; i++) {
            int required = n - i - 1;
            int j = i;

            while (j < n && trailingZeros[j] < required) {
                j++;
            }

            if (j == n) return -1;

            while (j > i) {
                int temp = trailingZeros[j];
                trailingZeros[j] = trailingZeros[j - 1];
                trailingZeros[j - 1] = temp;
                swaps++;
                j--;
            }
        }

        return swaps;
    }
}