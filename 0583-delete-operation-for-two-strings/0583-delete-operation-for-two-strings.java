class Solution {
    
    //可以转换为求两个字符串的最长公共子序列问题 LCS。
    
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        
        for(int i=0; i<m+1; i++){
            dp[i][0] = 0;
        }
        for(int j=0; j<n+1; j++){
            dp[0][j] = 0;
        }
        
        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return m + n - dp[m][n]*2;
    }
}