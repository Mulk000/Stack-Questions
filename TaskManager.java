import java.util.Stack;

class TaskManager {
    /**
     * TO-DO: Create a string showing the task sequence from bottom to top.
     * For a stack with ["Task C", "Task B", "Task A"] (top to bottom),
     * the output should be "Task A -> Task B -> Task C".
     * \*
     *
     * @param tasks The stack of task strings.
     * @return A formatted string of tasks.
     */
    public String getTaskSequence(Stack<String> tasks) {
        if (tasks.isEmpty()) {
            return "";
        }
        Stack<String> reversedStack = new Stack<>();
        while (!tasks.isEmpty()) {
            reversedStack.push(tasks.pop());
        }
        StringBuilder sequence = new StringBuilder();
        Stack<String> restoreStack = new Stack<>();
        while (!reversedStack.isEmpty()) {
            String result = reversedStack.pop();
            sequence.append(result);
            if (!reversedStack.isEmpty()) {
                sequence.append(" -> ");
            }

            restoreStack.push(result);
        }

        while (!restoreStack.isEmpty()) {
            tasks.push(restoreStack.pop());
        }


        return sequence.toString();
    }
}
