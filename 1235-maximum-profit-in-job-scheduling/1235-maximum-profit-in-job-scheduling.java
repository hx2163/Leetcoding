class Solution {
    

    private int findPrevCompatibleJobIndex(int[][] jobs, int currentIndex) {
        int left = 0;
        int right = currentIndex - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (jobs[mid][1] <= jobs[currentIndex][0]) {
                if (jobs[mid + 1][1] <= jobs[currentIndex][0]) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3]; // [startTime, endTime, profit]

        for (int i = 0; i < n; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }

        Arrays.sort(jobs, (a, b) -> a[1] - b[1]); // Sort jobs by end time

        int[] dp = new int[n];
        dp[0] = jobs[0][2]; // Initialize dp array with the profit of the first job

        for (int i = 1; i < n; i++) {
            int currentProfit = jobs[i][2];
            int prevCompatibleJobIndex = findPrevCompatibleJobIndex(jobs, i);

            if (prevCompatibleJobIndex != -1) {
                currentProfit += dp[prevCompatibleJobIndex];
            }

            dp[i] = Math.max(currentProfit, dp[i - 1]);
        }

        return dp[n - 1];
    }
}

