<h2>1. DoubleKnapsack </h2>

<p>Consider a 2-backpack version of Knapsack. Given are two backpacks of capacities W, and W2. Given are also n items (W1, C1), (W2, C2),..., (Wn, Cn), where w; is the weight and c; the cost of the i-th item. We want to find a set of items that can be split into two parts: one that fits in the first backpack and the other in the second backpack, and the sum of their costs is the largest possible. All the numbers are positive and W1, W2, and all the w;'s are integers. Give an O(nW W2) algorithm that finds a set of items to include in the first backpack and a set of items to include in the second backpack such that for each backpack its weight limit is satisfied and the total cost of these items is the largest possible.</p>

---

<h3>Code:</h3>

```Java

import java.util.Arrays;

class Main {

    public static int DoubleKnapsack(int W1, int W2, int[] wt, int[] val) {

        int[][][] dp = new int[wt.length + 1][W1 + 1][W2 + 1];

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

---

<h2>2. DoubleKnapsackSolution </h2>

<p>This problem is about reconstructing the solution of the 2-backpack Knapsack problem from prev Problem. Give an O(nW1W2) algorithm that finds a set of items to include in the first backpack and a set of items to include in the second backpack such that for each backpack its weight limit is satisfied and the total cost of these items is the largest possible..</p>

---

<h3>Code:</h3>

```Java

import java.util.Arrays;

class Main {
    static int[] wt = {9,9,2,9,6,3,1,7,8,4};
    static int[] val = {8,2,1,5,4,8,1,5,3,10};
    static int W1 = 15;
    static int W2 = 15;
    static int[][][] dp = new int[wt.length + 1][W1 + 1][W2 + 1];

    public static int DoubleKnapsack(int W1, int W2, int[] wt, int[] val) {

        int[][][] dp = new int[wt.length + 1][W1 + 1][W2 + 1];

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

    public static void DoubleKnapsackSolution(int W1, int W2, int[] wt, int[] val, List<Integer> backpack1, List<Integer> backpack2) {
        int i = wt.length, j = W1, k = W2;
        while (i > 0) {
            if (i == 0) {
                break;
            }

            // Check if the item is in the first backpack
            if (j >= wt[i - 1] && dp[i][j][k] == dp[i - 1][j - wt[i - 1]][k] + val[i - 1]) {
                backpack1.add(i); // Add the item to the first backpack
                j -= wt[i - 1]; // Reduce the remaining capacity of the first backpack
            }
            // Check if the item is in the second backpack
            else if (k >= wt[i - 1] && dp[i][j][k] == dp[i - 1][j][k - wt[i - 1]] + val[i - 1]) {
                backpack2.add(i); // Add the item to the second backpack
                k -= wt[i - 1]; // Reduce the remaining capacity of the second backpack
            }
            // Move to the previous item
            i--;
        }

        Collections.sort(backpack1);
        Collections.sort(backpack2);
    }


  public static void main(String args[]) {
        int maxCost = DoubleKnapsack(W1, W2, wt, val);

        List<Integer> backpack1 = new ArrayList<>();
        List<Integer> backpack2 = new ArrayList<>();

        DoubleKnapsackSolution(W1, W2, wt, val, backpack1, backpack2);

        System.out.println("The largest possible cost is " + maxCost);
        System.out.println("Items in the first backpack: " + backpack1);
        System.out.println("Items in the second backpack: " + backpack2);
  }
}

```


