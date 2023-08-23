class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character>set = new HashSet<>();
        int j = 0;
        if(s.length() == 0) return 0;
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max = Math.max(max, set.size());
            }else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
            }
        }
        return max;
    }
}

