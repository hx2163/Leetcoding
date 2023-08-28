class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder sb = new StringBuilder(s.toLowerCase()); // for later comparisons
      int idx = 0;  
      // remove non-letter character
      while (idx < sb.length()) {
        char ch = sb.charAt(idx);
        if (Character.isLetterOrDigit(ch)) { // letter or digit
          idx += 1;
        } else { // not letter
          sb.deleteCharAt(idx);
        }
      }
      System.out.println(sb);
      //check
      int left = 0;
      int right = sb.length() - 1; // update length
      while(left < right){
            if(sb.charAt(left) != sb.charAt(right))
                return false;
            left++;
            right--;
      }
      return true;
    }
}
