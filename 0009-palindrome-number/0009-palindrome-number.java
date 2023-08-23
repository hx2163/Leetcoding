class Solution {
    /*
    store one half of the integer in a another variable in reversed order.
    */
    public boolean isPalindromeHalf(int x) {
        if(x == 0){
            return true;
        }
        if(x < 0 || x % 10 == 0){
            return false;
        }
        int rev = 0;
        while(x > rev){
            int pop = x % 10;
            rev = rev*10 + pop;
            x = x/10;
        }
        // Handle both odd-length and even-length palindromes
        return (x==rev || x==rev/10);
    }
    
    
    public boolean isPalindrome(int num){
       if(num == 0) return true;
       if(num < 0 || num % 10 == 0) return  false; 
        
       int reversed = 0, remainder, original = num;
        
       while(num != 0) {   
            remainder = num % 10; 
            reversed = reversed * 10 + remainder;
            num  /= 10;  //the last digit is removed from num after division by 10.
        }
        // palindrome if original and reversed are equal
        return original == reversed;
    }
    
}

