class Solution {
    List<List<String>> res = new LinkedList<>();
    
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] box : board){
            Arrays.fill(box, '.');
        }
        helper(board, 0, 0, n);
        return res;
    }
    
    private void helper(char[][] board, int row, int col, int n){
        //column out of bound move to next row
        if(col == board[0].length){
            col = 0;
            row++;
        }
        
        // n is 0 => no queen left and add to the res
        if(n == 0){
            res.add(toString(board));
            return;
        }
        
        //row out of bound
        if(row == board.length)
            return;
        
        //place queen if valid
        if(isValid(board, row, col)){
            board[row][col] = 'Q';
            n--;
            helper(board, row, col + 1, n);
            //backtrack unchoose the option
            board[row][col] = '.';
            n++;
        }
        //skip this cell
        helper(board, row, col + 1, n);
    }
    //overide toString method
    private List<String> toString(char[][] board){
        List<String> list = new LinkedList<>();
        StringBuilder str;
        for(char[] box : board){
            str = new StringBuilder();
            for(char cur : box){
                str.append(cur);
            }
            list.add(str.toString());
        }
        return list;
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