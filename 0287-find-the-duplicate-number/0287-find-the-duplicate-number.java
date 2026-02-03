class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] seen = new int[n];  

        for (int i = 0; i < n; i++) {
            if (seen[nums[i]] == 1) {
                return nums[i];   
            }
            seen[nums[i]] = 1;
        }
        return -1;
    }
}
