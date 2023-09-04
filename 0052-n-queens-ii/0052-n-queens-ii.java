class Solution {
    
    public int totalNQueens(int n) { 
        char[][] board = new char[n][n];
        for(char[] box : board){
            Arrays.fill(box, '.');
        }
        return dfs(0, board);
    }
    
    public int dfs(int col, char board[][]){
        if(col == board.length) return 1;
        int count = 0;
        for(int row = 0; row < board.length; row++){
            if(isValid(board, row, col)){
                board[row][col] = 'Q';
                count += dfs(col + 1, board);
                board[row][col] = '.';
            }
        }
        return count;
    }
    
    private boolean isValid(char[][] board, int row, int col){
        int N = board.length;
        //Top and Down
        for(int i = 0; i < N; i++){
            if(board[i][col] != '.')
                return false;
            if(board[row][i] != '.')
                return false;
        }
        /* top left: i--j--
           top right: i--j++
           down left: i++j--
           down right: i++j++
         */

        
        //top left
        int i = row, 
        j = col;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }        
        //top right
        i = row;
        j = col;
        while(i >= 0 && j < N){
            if(board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        //down left
        i = row;
        j = col;
        while(i < N && j >= 0){
            if(board[i][j] == 'Q')
                return false;
            i++;
            j--;
        }        
        //down right
        i = row;
        j = col;
        while(i < N && j < N){
            if(board[i][j] == 'Q')
                return false;
            i++;
            j++;
        }
        return true;
    }
}

