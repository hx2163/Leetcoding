class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n][2];  // dp[i][0] represents when not holding a stock
                                           // dp[i][1] represents when holding a stock

        dp[0][0] = 0;  // Initial profit on the first day when not holding a stock is 0
        dp[0][1] = -prices[0];  // Initial profit on the first day when holding a stock is the negative of its price

        for (int i = 1; i < n; i++) {
            // Update the dp on day i when not holding a stock
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            
            // Update the dp on day i when holding a stock
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        
        return dp[n - 1][0];  // Return the last day when not holding a stock
    }
}
