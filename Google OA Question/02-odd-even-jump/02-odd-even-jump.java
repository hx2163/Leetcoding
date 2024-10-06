import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int oddEvenJump(int[] arr) {
        int result = 0;
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = [10,13,12,14,15];
        System.out.println(solution.oddEvenJump(arr));         //Output 2

        int[] arr2 = [2,3,1,1,4];
        System.out.println(solution.oddEvenJump(arr2));        //Output 3

        int[] arr3 = [5,1,3,4,2];
        System.out.println(solution.oddEvenJump(arr3));        //Output 3       
    }
}
