class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices.length < 2) {
            return 0;
        }
        
        int left = 0;
        int right = 1;
        int max_profit = 0;

        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                max_profit += prices[right] - prices[left];
            }
            left++;
            right++;
        }

        return max_profit;
    }
}