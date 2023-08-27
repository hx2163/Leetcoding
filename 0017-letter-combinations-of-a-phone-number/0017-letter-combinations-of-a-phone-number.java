class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length() == 0) return res;
        res.add("");
        
        String[] char_map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };  
        
        for(int i=0; i < digits.length(); i++){
            //ch - '0' => converting the character to the actual numerical value
            res = combine(char_map[digits.charAt(i)-'0'],res);            
        }       
        return res;
    }
    
    public static List<String> combine(String digit, List<String> l) {
        List<String> result = new ArrayList<String>();
            
            for (int i=0; i<digit.length(); i++) 
                for (String x : l) 
                    result.add(x + digit.charAt(i));
    
            return result;
    }
    
}
