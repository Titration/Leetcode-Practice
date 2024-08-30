class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices.length == 0) {
            return 0;
        }
        int s1 = - prices[0];
        int s2 = Integer.MIN_VALUE;
        int s3 = Integer.MIN_VALUE;
        int s4 = Integer.MIN_VALUE;

        for (int price : prices) {
            s1 = Math.max(s1, -price);
            s2 = Math.max(s2, s1 + price);
            s3 = Math.max(s3, s2 - price);
            s4 = Math.max(s4, s3 + price);
        }
        return s4;
    }
}