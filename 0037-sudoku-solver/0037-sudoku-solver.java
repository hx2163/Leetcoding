class Solution {
    private char[][] board;
    
    public void solveSudoku(char[][] board) {
        this.board = board;
        dfs(0,0);
    }
    
    private boolean dfs(int row, int col){
        //out of bound reset and start the next row
        if(col == 9){
            row += 1;
            col = 0;
        }
        
        //Reached last row -> finish search
        if(row == 9) return true;
        
        //Search the next cell
        if(board[row][col] != '.'){
            return dfs(row, col+1);
        }
        //dfs all valid options
        for(char i = '1'; i <= '9'; i++){
            if(!isValid(row, col, i))
                continue;
            board[row][col] = i;
            if(dfs(row, col + 1) == true)
                return true;
            board[row][col] = '.';
        }
        return false;
    }
    
    public boolean isValid(int row, int col, char cur){
        //Check same row and col
        for(int i = 0; i < 9; i++){
            if(board[row][i] == cur)
               return false;
            if(board[i][col] == cur)
               return false;
        }
               
        //Check box    
        int rowBox = row/3;
        int colBox = col/3;
        for(int i = rowBox*3; i < (rowBox+1)*3; i++){
            for(int j = colBox*3; j < (colBox+1)*3; j++){
                if(board[i][j] == cur) return false;
            }
        }
        
        return true;
    }

}