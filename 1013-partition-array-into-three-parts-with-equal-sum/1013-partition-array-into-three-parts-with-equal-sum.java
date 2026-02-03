class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;

        for (int num : arr) {
            total += num;
        }

        if (total % 3 != 0) {
            return false;
        }

        int target = total / 3;
        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            if (sum == target) {
                count++;
                sum = 0; 
            }
        }

        return count >= 3;
    }
}
