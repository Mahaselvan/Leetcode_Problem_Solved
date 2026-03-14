class Solution {
    int count = 0;
    String result = "";

    public String getHappyString(int n, int k) {
        dfs("", n, k);
        return result;
    }

    private void dfs(String curr, int n, int k) {
        if (curr.length() == n) {
            count++;
            if (count == k) {
                result = curr;
            }
            return;
        }

        for (char c : new char[]{'a','b','c'}) {
            if (curr.length() == 0 || curr.charAt(curr.length()-1) != c) {
                dfs(curr + c, n, k);
                if (!result.equals("")) return; 
            }
        }
    }
}