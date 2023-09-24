class Solution {
    public int strStr(String haystack, String needle) {
        int hlength = haystack.length();
        int nlength = needle.length();
        
        if(hlength < nlength)
            return -1;
        for(int i=0; i<=hlength-nlength; i++){
            int j = 0;
            while(j < nlength && haystack.charAt(i+j) == needle.charAt(j))
                j++;
            if(j == nlength) return i;
        }
        return -1;
    }
}
