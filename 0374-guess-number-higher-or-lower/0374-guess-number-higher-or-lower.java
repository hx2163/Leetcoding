/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    /*
    Recusive
    */
    public int guessNumberRec(int n) {
        if(guess(n) == 0) return n;
        else if(guess(n) == -1) n = guessNumber(n-1);
        else n = guessNumber(n+1);
        return n;
    }
    
    /*
    using mid
    */
    public int guessNumber(int n) {
        long start=1, end=n, mid;
        while( start<=end){
            mid= (start+end)/2;
            if( guess((int)mid)==0) return (int)mid;
            else if( guess((int)mid)==1) start=mid+1;
            else end=mid-1; 
        }
        return -1;
    }
}