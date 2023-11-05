<h2>1. DoubleKnapsack </h2>

<p>Consider a 2-backpack version of Knapsack. Given are two backpacks of capacities W, and W2. Given are also n items (W1, C1), (W2, C2),..., (Wn, Cn), where w; is the weight and c; the cost of the i-th item. We want to find a set of items that can be split into two parts: one that fits in the first backpack and the other in the second backpack, and the sum of their costs is the largest possible. All the numbers are positive and W1, W2, and all the w;'s are integers. Give an O(nW W2) algorithm that finds a set of items to include in the first backpack and a set of items to include in the second backpack such that for each backpack its weight limit is satisfied and the total cost of these items is the largest possible.</p>

---

<h3>Code:</h3>

```Java

import java.util.Arrays;

class Main {

    public static int DoubleKnapsack(int W1, int W2, int[] wt, int[] val) {

        //int[][][] dp = new int[wt.length + 1][W1 + 1][W2 + 1];

        for (int i = 1; i <= wt.length; i++) {
            for (int w1 = 0; w1 <= W1; w1++) {
                for (int w2 = 0; w2 <= W2; w2++) {
                    // if the i-th item is included in the first backpack
                    if (wt[i - 1] <= w1) {
                        dp[i][w1][w2] = Math.max(dp[i][w1][w2], dp[i - 1][w1 - wt[i - 1]][w2] + val[i - 1]);
                    }
                    //  if the i-th item is included in the second backpack
                    if (wt[i - 1] <= w2) {
                        dp[i][w1][w2] = Math.max(dp[i][w1][w2], dp[i - 1][w1][w2 - wt[i - 1]] + val[i - 1]);
                    }
                    //if the i-th item is not included in either backpack
                    dp[i][w1][w2] = Math.max(dp[i][w1][w2], dp[i - 1][w1][w2]);
                }
            }
        }

        return dp[wt.length][W1][W2];
    }

  public static void main(String args[]) {
        int[] wt = {1, 2, 3};
        int[] val = {6, 10, 12};
        int W1 = 5;
        int W2 = 5;

        int maxCost = DoubleKnapsack(W1, W2, wt, val);
        System.out.println("The largest possible cost is " + maxCost);
  }
}

```


