import java.util.Stack;

public class Solution {
    public static int solution(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        int currIndex = 0;
        for (int digit : digits) {
	    /*
	    !stack.isEmpty(): This checks that the stack is not empty before calling pop()
     	    stack.size() + (digits.length - currIndex) > 3: This ensures that we have enough remaining elements to potentially build a number with three digits.
	    stack.peek() < digit: This checks if the current digit (digit) is larger than the top element of the stack.
	    */
            while (!stack.isEmpty() && stack.size() + (digits.length - currIndex) > 3 && stack.peek() < digit) {
                stack.pop();
            }
            
            if (stack.size() < 3) {
                stack.push(digit);
            }
	    currIndex++;
        }

        //combine the elements in the stack into numbers
        int result = 0;
        for (int digit : stack) {
            result = result * 10 + digit;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] digits1 = {7, 2, 3, 3, 4, 9}; //749
        int[] digits2 = {0, 0, 5, 7}; //57

        System.out.println(solution(digits1)); 
        System.out.println(solution(digits2));
    }
}
