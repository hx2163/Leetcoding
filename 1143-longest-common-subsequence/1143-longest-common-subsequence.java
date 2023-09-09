// class Solution {

//     public int longestCommonSubsequence(String text1, String text2) {
//         int m = text1.length();
//         int n = text2.length();
        
//         int[][] memo = new int[m+1][n+1];
//         // initializing the memo to -1;
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 memo[i][j] = -1;
//             }
//         }
//         return LCS(text1, text2, m, n-1, memo);
//     }
        
        
//    public int LCS(String X, String Y, int i, int j, int[][] memo){
        
//         if(i == 0 || j == 0)
//             return 0;
       
//         if(memo[i][j] == -1){
//             if(X.charAt(i) == Y.charAt(j)){
//                 memo[i][j] = LCS(X,Y,i-1,j-1,memo) + 1;
//             }else{
//                 memo[i][j] = Math.max(LCS(X,Y,i-1,j,memo), 
//                                       LCS(X,Y,i,j-1,memo));
//             }
//         }
//         return memo[i][j];
//     }
// }


class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] dp = new int [text1.length()+1][text2.length()+1];
        for(int i=1;i<dp.length;i++) {
            for(int j=1;j<dp[0].length;j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else 
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[text1.length()][text2.length()];
    }
}

