package Technical;

import java.util.Stack;

public class BalancedStringFindPosition {
     public static void main(String[] args) {
        char[] arr = {'{', '[', '(', '[', ']', ')', ']', '[', ']'};
        int position = 2;
        int matchingPosition = findMatchingPosition(arr, position);
        System.out.println("Matching position for position " + position + ": " + matchingPosition);
    }

    public static int findMatchingPosition(char[] arr, int position) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '[' || arr[i] == '{' || arr[i] == '(') {
                stack.push(i);
            } else if (arr[i] == ']' || arr[i] == '}' || arr[i] == ')') {
                System.out.println(stack.peek());
                if (!stack.isEmpty() && stack.peek() == position) {
                    return i;
                }
                stack.pop();
            }
        }

        return -1; // If no matching position is found
    }
}
