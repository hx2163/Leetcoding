class Solution {
    /*
    2 conditions:  
        - only add open if open < n
        - only add a closing if close < open
        - vaild iif open == close == n
    */
    
    
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        backtrack(res, "", 0, 0, n);
        return res;
    }
    
    public void backtrack(List<String> res, String cur_string, int open, int close, int n){
        //base case
        if(cur_string.length() == n*2){ 
            res.add(cur_string);
            return;
        }
        if(open < n)
            backtrack(res, cur_string + '(', open + 1, close, n);       
        if(close < open)
            backtrack(res, cur_string + ')', open, close + 1, n);        
    }
}