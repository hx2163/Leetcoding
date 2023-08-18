class Solution {
    /*
    Count With Modulo by 2 and both are not same then increase distance by one
    */
    public int hammingDistance(int x, int y) {
        int distance = 0;
        for(int xor = x^y; xor != 0; xor=xor&(xor-1)){
            distance++;
        }
        return distance;
    }
}