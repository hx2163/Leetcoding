class Solution {
    public char findTheDifference(String s, String t) {
        //if we take XOR of every character. the similar char will cancel each other and the left the diff
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}