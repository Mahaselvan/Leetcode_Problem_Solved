class Solution {
    public int numOfWays(int n) {
        int MOD = 1_000_000_007;

        long A = 6;
        long B = 6;

        for (int i = 2; i <= n; i++) {
            long nextA = (3 * A + 2 * B) % MOD;
            long nextB = (2 * A + 2 * B) % MOD;
            A = nextA;
            B = nextB;
        }

        return (int)((A + B) % MOD);
    }
}
