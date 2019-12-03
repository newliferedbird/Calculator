import java.util.EmptyStackException;
import java.util.Stack;

public class ManipulationString {
    GettingString gettingString = new GettingString();
    Stack<String> inStack = new Stack<>();
    Stack<String> outStack = new Stack<>();
    Stack<String> finalResult = new Stack<>();

    public Stack<String> polishNotation(){
        String[] inArray = gettingString.inputString().split("\\b");
            for (String val : inArray) {
                if (val.equals("+") || val.equals("-") || val.equals("*") || val.equals("/")) {
                    switch (val) {
                        case ("+"):
                        case ("/"):
                        case ("-"):
                        case ("*"):
                            stackSorting(inStack, outStack, val);
                            break;
                    }
                }
                else {
                    outStack.add(val);
                }
            }
            while (inStack.size() > 0) {
                outStack.add(inStack.pop());
            }
            while (outStack.size() > 0) {
                finalResult.add(outStack.pop());
            }
        return finalResult;
        }

    public void stackSorting(Stack<String> inStack, Stack<String> outStack, String val) {
        try {
            if (inStack.peek().equals("^") || inStack.peek().equals("*") || inStack.peek().equals("/")) {
                outStack.add(inStack.pop());
                inStack.add(val);
            } else {
                inStack.add(val);
            }
        } catch (EmptyStackException e) {
            inStack.add(val);
        }
    }
}



