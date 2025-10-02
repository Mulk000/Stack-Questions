import java.util.GregorianCalendar;
import java.util.Stack;

class PathSimplifier {
    /**
     * TO-DO: Simplify a Unix-style file path.
     * For example, "/a/./b/../../c/" should become "/c".
     * And "/../" should become "/".
     * \*
     *
     * @param path The absolute path string.
     * @return The simplified canonical path.
     */
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        // Your code here:
        // Iterate through the 'components'.
        for (String result : components) {
            if (result.equals(".") || result.isEmpty()) {
                continue;

            } else if (result.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(result);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }


        StringBuilder resultTow = new StringBuilder();
        for (String dir : stack) {
            resultTow.append("/").append(dir);
        }
        return resultTow.toString();
    }
}