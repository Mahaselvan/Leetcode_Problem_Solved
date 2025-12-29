class Solution {
    public static int reverse(int num) {
        int res = 0;
        while (num != 0) {
            int digit = num % 10;
            
            // Check for overflow
            if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) {
                return 0;
            }
            
            res = res * 10 + digit;
            num /= 10;
        }
        return res;
    }
}
