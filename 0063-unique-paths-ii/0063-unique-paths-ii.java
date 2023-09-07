class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        System.out.println(m);
        System.out.println(n);        
        //memo
        int[][] grid = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1)  {
                grid[i][0] = 0;
                //on the first column, if there is an obstacle, the rest are blocked. 
                //no need to continue.
                break;  
            } else
                grid[i][0] = 1;
        }
        
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] == 1)  {
                grid[0][j] = 0;
                //on the first row, if there is an obstacle, the rest are blocked. 
                //no need to continue.
                break;  
            } else
                grid[0][j] = 1;
        }
        
        for (int i = 1; i < m; i++){
            for( int j = 1; j < n; j++){
                if (obstacleGrid[i][j] == 1) 
                    grid[i][j] = 0;
                else
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
            
        }
        
        return grid[m-1][n-1];
    }
}