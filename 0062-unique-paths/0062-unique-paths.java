public class Solution {
    public int uniquePaths(int m, int n) {
        //memo
        int[][] grid = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i==0 || j==0)
                    grid[i][j] = 1;
                else //recursive foumular
                    grid[i][j] = grid[i][j-1] + grid[i-1][j];
            }
        }
        //return the finish box
        return grid[m-1][n-1];
    }
}