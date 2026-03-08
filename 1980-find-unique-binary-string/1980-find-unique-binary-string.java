class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (nums[i].charAt(i) == '0')
                res.append('1');
            else
                res.append('0');
        }

        return res.toString();
    }
}