class Solution {
    /*
    dp
    */
    public int maxProfitDP(int[] prices) {
        int len = prices.length;
        
        if(len < 2) return 0;
        
        //new dp arr
        int[][] dp = new int[len][2];
        
        //inti
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        
        for(int i = 1; i < len; i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], -prices[i]);
        }
        return dp[len - 1][0];
    }
    
    /*
    without arr
    */
    public int maxProfit(int[] prices) {
        
        if(prices.length < 2) return 0;
        int min = prices[0];
        int diff = 0;
        
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > min) {
                diff = Math.max(diff, prices[i] - min);
            }
            else{
                min = prices[i];
            }
        }
        return diff;
    }
}