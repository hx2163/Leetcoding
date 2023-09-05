class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sToT = new char[256];
        char[] tToS = new char[256];
        
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //if we havent seen char in both s and t array
            if(sToT[sChar] == 0 && tToS[tChar] == 0){
                /*
                    mapping rule:
                    s = 'foo' t = 'bar'
                    sToT[f] = 'b' and tToS['b'] = f
                */
                sToT[sChar] = tChar;
                tToS[tChar] = sChar;
            }else if (sToT[sChar] != tChar){
                return false;
            }
        }
        return true;
     }
}