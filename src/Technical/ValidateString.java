package Technical;

import java.util.Stack;

public class ValidateString {
    public static void main(String[] args) {
        String str = "{[())]}";

        char[] ch = str.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        for (char c : ch) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);

            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Not Valid");
                    return;
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    System.out.println("Not Valid");
                    return;
                }
            }

        }
        
        if(stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
