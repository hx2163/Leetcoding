class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount+1);
        
        //base case
        dp[0] = 0;
        
        for(int i=1; i<amount + 1; i++){
            int curAmount = i;
            for(int coin : coins){
                if(curAmount - coin >= 0){
                    dp[i] = Math.min(dp[curAmount - coin] + 1, dp[i]);
                }
            }
        }
        return dp[amount] == amount + 1? -1 : dp[amount];
    }
}