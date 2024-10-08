class Solution {
    public int lengthOfLongestSubstring2(String s) {
        Set set = new HashSet();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while(!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
    
    public int lengthOfLongestSubstring(String s) {
        Set set = new HashSet();
        int left = 0;
        int max = 0;
        
        if(s.length() == 0) return 0;
        
        for(int right = 0;right < s.length(); right++){
            // if s[right] not in set => no repeating characters 
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right)); //add s[right] to set
                max = Math.max(set.size(), max); //if set size > max update the max
            }
            //if s[right] is in set
            else{
                //move the pointer left and remove s[left] from set
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
                //after remove the repeat char then add s[right] into set
                set.add(s.charAt(right));
            }
        }
        
        return max;
    }
}