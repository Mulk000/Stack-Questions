import java.util.Stack;

class BracketChecker {
    /**
     * TO-DO: Refactor this method to remove its dependency on the three helper methods
     * (isOpening, isClosing, isMatchingPair) by inlining their logic.
     */
    public boolean isBalancedRefactored(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                // Your code here for handling opening brackets
            } else if (c == ')' || c == '}' || c == ']') {

                if (stack.isEmpty()) {
                    return false;
                }
                char d = stack.pop();
                if (c == (')') && d != '(' || c == '}' && d != '{' || c == ']' && d != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}












