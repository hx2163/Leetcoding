class Solution {
    Integer[] dp;
    public int integerBreak(int n) {
        //base case
        dp = new Integer[n+1];
        return dfs(n);
    }
    
    private int dfs(int n){
        if(n < 2) return 0;
        
        if(dp[n] != null) return dp[n];
        
        int max = 0;
        for(int i = 1; i < n; i++){
            int curMax = Math.max(dfs(n-i), n-i);
            max = Math.max(curMax*i, max);
        }
        dp[n] = max;
        return max;
    }
}