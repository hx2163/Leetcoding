class Solution {
    public boolean isValidSudoku(char[][] board) {
        //hash set add only distict value
        HashSet<String> seen = new HashSet();
        
        for(int i=0; i<9; i++){            
            for(int j=0; j<9; j++){
                char cur = board[i][j];
                if(cur != '.'){
                    if(!seen.add(cur + "found in row" + i) ||
                        !seen.add(cur + "found in col" + j) ||
                        !seen.add(cur + "found in box" + i/3 + "-" + j/3))
                        return false;
                }   
            }
        }
        return true;
    }
}