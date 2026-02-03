class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n = arr.length;
        int res = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    if (Math.abs(sum - target) < Math.abs(res - target)) {
                        res = sum;
                    }
                }
            }
        }
        return res;
    }
}
