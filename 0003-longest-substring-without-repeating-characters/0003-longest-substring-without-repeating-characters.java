class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character>set = new HashSet<>();
        
        int j = 0; //pointer
        
        if(s.length() == 0) 
            return 0;
        
        for(int i = 0; i < s.length(); i++){
        // if s[i] not in set => no repeating characters 
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i)); //add s[i] to set
                max = Math.max(max, set.size()); //if size > max update the maxlength
            }else{ //if s[i] is in set
                while(set.contains(s.charAt(i))){ 
                    //move the pointer j and remove s[j] from set
                    set.remove(s.charAt(j));
                    j++; 
                }
                //after remove the repeat char then add s[i] into set
                set.add(s.charAt(i));
            }
        }
        return max;
    }
}

