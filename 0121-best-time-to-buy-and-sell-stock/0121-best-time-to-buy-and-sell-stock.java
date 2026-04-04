class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            int diff=prices[i]-min;
            max=Math.max(max,diff);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}