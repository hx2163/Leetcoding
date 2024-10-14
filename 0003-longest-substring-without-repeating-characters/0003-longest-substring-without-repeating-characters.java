class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        
        int max = 0;
        int left = 0;
        
        for(int r=0; r<s.length(); r++){
            // 如果遇到重复字符，移动左指针直到窗口内无重复字符
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(left));
                left++;
            }
            //add char and update max
            set.add(s.charAt(r));
            max = Math.max(max, r-left+1);
        }
        return max;
    }
}