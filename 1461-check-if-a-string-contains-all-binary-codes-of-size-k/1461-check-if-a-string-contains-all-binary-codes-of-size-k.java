class Solution {
    public boolean hasAllCodes(String s, int k) {
        if (k > s.length()) return false;
        
        int total = 1 << k; 
        boolean[] seen = new boolean[total];
        int count = 0;
        
        int hash = 0;
        int mask = total - 1;
        
        for (int i = 0; i < s.length(); i++) {
            hash = ((hash << 1) & mask) | (s.charAt(i) - '0');
            
            if (i >= k - 1) {
                if (!seen[hash]) {
                    seen[hash] = true;
                    count++;
                    if (count == total) return true;
                }
            }
        }
        
        return false;
    }
}