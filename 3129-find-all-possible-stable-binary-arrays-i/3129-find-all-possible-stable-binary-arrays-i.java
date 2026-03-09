class Solution {

    static final int MOD = 1000000007;

    public int numberOfStableArrays(int zero, int one, int limit) {

        long[][][] dp = new long[zero + 1][one + 1][2];

        for (int k = 1; k <= Math.min(limit, zero); k++)
            dp[k][0][0] = 1;

        for (int k = 1; k <= Math.min(limit, one); k++)
            dp[0][k][1] = 1;

        for (int z = 0; z <= zero; z++) {
            for (int o = 0; o <= one; o++) {

                if (dp[z][o][0] > 0) {
                    for (int k = 1; k <= limit && o + k <= one; k++) {
                        dp[z][o + k][1] = (dp[z][o + k][1] + dp[z][o][0]) % MOD;
                    }
                }

                if (dp[z][o][1] > 0) {
                    for (int k = 1; k <= limit && z + k <= zero; k++) {
                        dp[z + k][o][0] = (dp[z + k][o][0] + dp[z][o][1]) % MOD;
                    }
                }
            }
        }

        return (int)((dp[zero][one][0] + dp[zero][one][1]) % MOD);
    }
}