class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (int k = 0; k < strs.length; k++) {
            int ones = 0;
            int zeros = 0;
            // Convert the string to a char array to use it in for-each loop
            for (char x : strs[k].toCharArray()) {
                if (x == '1') {
                    ones += 1;
                } else {
                    zeros += 1;
                }
            }

            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i - zeros][j - ones] + 1, dp[i][j]);
                }
            }
        }
        return dp[m][n];
    }

}


// public int findMaxForm(String[] strs, int m, int n) {
//     int l = strs.length;
//     int[][][] dp = new int[l+1][m+1][n+1];
    
//     for (int i = 0; i < l+1; i++) {
//         int[] nums = new int[]{0,0};
//         if (i > 0) {
//             nums = calculate(strs[i-1]);
//         }
//         for (int j = 0; j < m+1; j++) {
//             for (int k = 0; k < n+1; k++) {
//                 if (i == 0) {
//                     dp[i][j][k] = 0;
//                 } else if (j>=nums[0] && k>=nums[1]) {
//                     dp[i][j][k] = Math.max(dp[i-1][j][k], dp[i-1][j-nums[0]][k-nums[1]]+1);
//                 } else {
//                     dp[i][j][k] = dp[i-1][j][k];
//                 }
//             }
//         }
//     }
    
//     return dp[l][m][n];
// }

// private int[] calculate(String str) {
//     int[] res = new int[2];
//     Arrays.fill(res, 0);
    
//     for (char ch : str.toCharArray()) {
//         if (ch == '0') {
//             res[0]++;
//         } else if (ch == '1') {
//             res[1]++;
//         }
//     }
    
//     return res;
// }