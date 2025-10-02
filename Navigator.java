import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Navigator {
    /**
     * TO-DO: Generate the return journey instructions.
     * \*
     *
     * @param forwardJourney A List of string instructions for the trip.
     * @return A List of string instructions for the return trip.
     */
    public List<String> traceBack(List<String> forwardJourney) {
        Stack<String> pathStack = new Stack<>();
        for (String step : forwardJourney) {
            pathStack.push(step);
        }

        List<String> returnJourney = new ArrayList<>();
        while (!pathStack.isEmpty()) {
            String currentStep = pathStack.pop();
            String oppositeStep = getOppositeStep(currentStep);
            returnJourney.add(oppositeStep);
        }
        return returnJourney;
    }

    /**
     * TO-DO: Implement the logic to find the opposite of a navigation step.
     */
    private String getOppositeStep(String step) {
        // Your code here. Use if/else if or a switch statement.
        if (step.equals("LEFT")) {
            return "RIGHT";
        } else if (step.equals("RIGHT")) {
            return "LEFT";
        } else if (step.startsWith("TAKE EXIT")) {
            String exitNumber = step.replaceAll("[^0-9]", "");

            return "ENTER ROUND ABOUT AT EXIT " + exitNumber;
        }
        return "";
    }
}

