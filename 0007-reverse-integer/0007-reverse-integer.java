class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            /*
            Integer.MAX_VALUE is equal 2147483647. 
            Integer.MIN_VALUE is equal  -2147483648. 
            Last digits are 7 and 8. 
            This is the reason why we check  pop>7 and pop < -8 conditions
            */
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}