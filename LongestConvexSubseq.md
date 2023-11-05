<h2>1. LongestConvexSubseq </h2>

<p>Input specification: the first line contains n and the next line contains a1, ..., an, separated by spaces. You may assume that all the numbers fit in int and that n is at most 1,000.

Output specification: the output contains one line with the maximum length of a convex subsequence of a1, ..., an.</p>

---

<h3>Code:</h3>

```Java

import java.util.Arrays;

class Main {

    public static int longestConvexSubsequence(int[] a) {
            int n = a.length;
            int[][] dp = new int[n][n];
            //int maxLength = 2; // Any two elements can form a convex sequence.
    
            // Initialize dp array. Any subsequence with itself has length 1.
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = 2; // Minimum length is 2, since we are looking for subsequences with at least 3 elements.
                }
            }
    
            for (int i = 2; i < n; i++) {
                // Move backwards from i-1 for j, for each j, try all k < j.
                for (int j = i - 1; j >= 1; j--) {
                    for (int k = j - 1; k >= 0; k--) {
                        if (a[k] + a[i] >= 2 * a[j]) {
                            dp[j][i] = Math.max(dp[j][i], dp[k][j] + 1);
                            //maxLength = Math.max(maxLength, dp[j][i]);
                        }
                    }
                }
            }
    
            int maxLength = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    maxLength = Math.max(maxLength, dp[j][i]);
                }
            }
            return maxLength;
    }


  public static void main(String args[]) {
    int[] sequence = {1, 3, 2, 4, 9, 7, 8, 3, 5, 10};
        System.out.println("Length of the longest convex subsequence is: " + longestConvexSubsequence(sequence));
  }
}

```


