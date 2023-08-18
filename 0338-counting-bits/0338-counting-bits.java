class Solution {
    
    // x&(x-1)
    public int[] countBits2(int n) {
        int[] bits = new int[n+1];
        bits[0] = 0;
        for(int i=1; i<=n; i++){
            bits[i] = bits[i&(i-1)] + 1;
        }
        return bits;
    }
    
    //odd or even
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        bits[0] = 0;
        for(int i=1; i<=n; i++){
            if((i&1) == 1){ // is odd
                bits[i] = bits[i-1] + 1;
            }else{ //is even: number of 1's = bit[i]/2
                bits[i] = bits[i>>1];
            }
        }
        return bits;
    }    
    
}