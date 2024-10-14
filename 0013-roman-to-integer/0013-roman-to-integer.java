class Solution {
    
    private int helper(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;            
            case 'M': return 1000;
            default : return 0;          
        }
    }
    
    public int romanToInt(String s) {
        int res = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int curr = helper(s.charAt(i));
            
            // 检查是否还有下一个字符
            if (i + 1 < s.length()) {
                int next = helper(s.charAt(i + 1));
                // 如果当前值小于下一个值，则用减法
                if (curr < next) {
                    res -= curr;
                } else {
                    res += curr;
                }
            } else {
                // 没有下一个字符时，直接加上当前值
                res += curr;
            }
        }
        
        return res;
    }
}