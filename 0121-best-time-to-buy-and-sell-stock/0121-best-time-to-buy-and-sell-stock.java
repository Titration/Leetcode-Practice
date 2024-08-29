class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices.length < 2) {
            return 0;
        }

        int p1 = 0; // buy
        int p2 = 1; // sell
        int max_profit = 0;

        while (p1 < prices.length && p2 < prices.length) {
            if (prices[p1] > prices[p2]) {
                p1 = p2;
                p2 = p1 + 1;
            } else {
                if (max_profit < prices[p2] - prices[p1]) {
                    max_profit = prices[p2] - prices[p1];
                }
                p2++; // find if there is the next sell date
            }
        }

        return max_profit;
    }
}