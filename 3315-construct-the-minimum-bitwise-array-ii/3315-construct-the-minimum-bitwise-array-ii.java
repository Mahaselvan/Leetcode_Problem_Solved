class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
                int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int x = nums.get(i);

            if ((x & 1) == 0) {
                ans[i] = -1;
                continue;
            }

            int k = 0;
            while (((x >> k) & 1) == 1) {
                k++;
            }

            ans[i] = x - (1 << (k - 1));
        }
        return ans;

    }
}