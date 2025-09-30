import java.util.Stack;

class PalindromeChecker {
    /**
     * TO-DO: Use a Stack to determine if a string is a palindrome.
     * \*
     *
     * @param input The string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    public boolean isPalindrome(String input) {
        String lowercased = input.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char ch : lowercased.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return lowercased.equals(reversed.toString());
    }
}