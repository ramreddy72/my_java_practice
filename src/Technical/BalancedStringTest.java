package Technical;

import java.util.Stack;

public class BalancedStringTest {
    public static void main(String[] args) {
        char[] arr = { '{', '[', '(', '[', ']', ')', ']', '}', '[', ']' };
        
        Stack<Character> stack = new Stack<>();
        for (char c : arr) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Not balanced");
                    return;
                }
                char top = stack.pop();
                if ((c == ']' && top != '[') || (c == '}' && top != '{') || (c == ')' && top != '(')) {
                    System.out.println("Not balanced");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
        
    }
}
