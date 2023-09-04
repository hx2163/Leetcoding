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
    
    public void helper(char[][] board, int row, int col, int n){
        if(n == 0){
            res.add(toString(board));
            return;
        }
        if(col == board[0].length){
            col = 0;
            row ++;
        }
        if(row == board.length){
            return;
        }
        if(isVaild(board, row, col)){
            board[row][col] = 'Q';
            n--;
            helper(board, row, col + 1, n);
            board[row][col] = '.';
            n++;
        }
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
    
    private boolean isVaild(char[][] board, int row, int col){
        //top and down
        int N = board.length;
        for(int i = 0; i < N; i++){
            if(board[row][i] == 'Q')
                return false;
            if(board[i][col] == 'Q')
                return false;
        }
        
        //top left
        int i = row; 
        int j = col;
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