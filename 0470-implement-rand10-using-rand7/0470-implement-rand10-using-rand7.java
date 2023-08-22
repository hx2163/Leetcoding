/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */

 // rand7 --> rand 49 ---> rand 40 -->取% = rand 10
class Solution extends SolBase {
    public int rand10() {
        int temp = 40;
        while(temp >= 40) {
            temp = (rand7()-1)*7 + rand7()-1;
        }
        return temp%10 + 1;
        
    }
}

/*  randN --> randM
    randN --> randX X>=M X是N的整数倍 
*/