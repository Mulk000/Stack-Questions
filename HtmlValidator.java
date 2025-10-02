import java.util.Stack;

class HtmlValidator {
    /**
     * TO-DO: Check if an array of HTML tags is well-formed.
     * \*
     *
     * @param tags An array of strings, where each string is a tag like "<html>" or "</html>".
     * @return true if the tags are properly nested and balanced, false otherwise.
     */
    public boolean isWellFormed(String[] tags) {
        Stack<String> tagStack = new Stack<>();
        for (String tag : tags) {
            if (tag.startsWith("</")) {
                String tagName = tag.substring(2, tag.length() - 1);
                if (tagStack.isEmpty()) {
                    return false;
                }
                String openTag = tagStack.pop();
                if (!openTag.equals(tagName)) {
                    return false;
                }
            } else {
                String tagName = tag.substring(1, tag.length() - 1);
                tagStack.push(tagName);
            }
        }
        return tagStack.isEmpty();
    }
}