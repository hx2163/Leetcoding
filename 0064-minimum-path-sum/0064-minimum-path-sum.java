class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        for(int m = 0; m < row; m++){
            for(int n = 0; n < col; n++){
                if(m == 0 && n == 0) grid[m][n] = grid[m][n];
                else if(m == 0 && n != 0) grid[m][n] = grid[m][n] + grid[m][n-1];
                else if(n == 0 && m != 0) grid[m][n] = grid[m][n] + grid[m-1][n];
                else grid[m][n] = grid[m][n] + Math.min(grid[m-1][n], grid[m][n-1]);
            }
        } 
        return grid[row-1][col-1];
    }
}
