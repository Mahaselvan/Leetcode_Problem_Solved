class Solution {
    public long minimumCost(
            String source,
            String target,
            String[] original,
            String[] changed,
            int[] cost
    ) {
        int n = source.length();
        long INF = (long) 1e18;

        Set<String> set = new HashSet<>();
        for (String s : original) set.add(s);
        for (String s : changed) set.add(s);

        List<String> list = new ArrayList<>(set);
        int m = list.size();

        Map<String, Integer> id = new HashMap<>();
        for (int i = 0; i < m; i++) id.put(list.get(i), i);

        long[][] dist = new long[m][m];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int i = 0; i < original.length; i++) {
            int u = id.get(original[i]);
            int v = id.get(changed[i]);
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }

        for (int k = 0; k < m; k++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        long[] dp = new long[n + 1];
        Arrays.fill(dp, INF);
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {

            if (source.charAt(i) == target.charAt(i)) {
                dp[i] = dp[i + 1];
            }

            for (String o : list) {
                int len = o.length();
                if (i + len > n) continue;

                if (!source.regionMatches(i, o, 0, len)) continue;

                String tSub = target.substring(i, i + len);
                if (!id.containsKey(tSub)) continue;

                long c = dist[id.get(o)][id.get(tSub)];
                if (c == INF) continue;

                dp[i] = Math.min(dp[i], c + dp[i + len]);
            }
        }

        return dp[0] == INF ? -1 : dp[0];
    }
}