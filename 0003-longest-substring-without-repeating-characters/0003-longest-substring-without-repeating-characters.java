class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, max = 0;  
        Set<Character> set = new HashSet<>();

        if(s.length() == 0) return 0;
        while(end < s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                max = Math.max(max, set.size());
                end++;
            }else{
                set.remove(s.charAt(start));
                start++;

            }
        }
        return max;
    }
}