class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 0, right = (long)1e18;
        long ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (can(mid, mountainHeight, workerTimes)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean can(long time, int height, int[] workerTimes) {
        long total = 0;

        for (int w : workerTimes) {
            long x = (long)((Math.sqrt(1 + 8.0 * time / w) - 1) / 2);
            total += x;

            if (total >= height)
                return true;
        }

        return false;
    }
}