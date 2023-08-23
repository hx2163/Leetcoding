class Solution {
    
    private int helper(char c){
        switch(c){
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
        int result = 0;
        
        for(int i=0; i < s.length(); i++){
            char front = s.charAt(i);

            //Odd length case
            if((i+1) > s.length()-1){
                result += helper(front);
                break;
            }
            char back = s.charAt(i+1);
            if(helper(back) > helper(front))
                result -= helper(front);
            else
                result += helper(front);
        }
        
        return result;
        
    }
}