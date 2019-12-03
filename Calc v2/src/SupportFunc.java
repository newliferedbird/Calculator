import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class SupportFunc {
    public void trycatch(Stack<String> inStack, Stack<String> outStack, String val) {

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

    public void formingOutStack(Stack<String> inStack, Stack<String> outStack, Stack<String> finalresult) {
        while (inStack.size() > 0) {
            outStack.add(inStack.pop());
        }
        while (outStack.size() > 0) {
            finalresult.add(outStack.pop());
        }
    }

    public void Calculated(Stack<String> finalresult, Stack<String> result) {

        while (finalresult.size() > 0) {
            if (finalresult.peek().equals("+") || finalresult.peek().equals("-") || finalresult.peek().equals("*") || finalresult.peek().equals("/")) {
                switch (finalresult.peek()) {
                    case ("+"):
                        finalresult.pop();
                        int x1 = Integer.parseInt(result.pop());
                        int x2 = Integer.parseInt(result.pop());
                        int finalresult1 = x1 + x2;
                        result.add(Integer.toString(finalresult1));
                        break;
                    case ("-"):
                        finalresult.pop();
                        x1 = Integer.parseInt(result.pop());
                        x2 = Integer.parseInt(result.pop());
                        finalresult1 = x1 - x2;
                        result.add(Integer.toString(finalresult1));
                        break;
                    case ("*"):
                        finalresult.pop();
                        x1 = Integer.parseInt(result.pop());
                        x2 = Integer.parseInt(result.pop());
                        finalresult1 = x1 * x2;
                        result.add(Integer.toString(finalresult1));
                        break;
                    case ("/"):
                        finalresult.pop();
                        x1 = Integer.parseInt(result.pop());
                        x2 = Integer.parseInt(result.pop());
                        finalresult1 = x1 / x2;
                        result.add(Integer.toString(finalresult1));
                        break;
                }
            } else {
                result.add(finalresult.pop());
            }
        }
    }
    public void sortArray(String[] inArray, Stack<String> inStack, Stack<String> outStack, SupportFunc sf){
        for (String val : inArray) {
            if (val.equals("+") || val.equals("-") || val.equals("*") || val.equals("/")) {

                switch (val) {
                    case ("+"):
                    case ("/"):
                    case ("-"):
                    case ("*"):
                        sf.trycatch(inStack, outStack, val);
                        break;
                }

            } else {
                outStack.add(val);
            }
        }
    }
    public void inputreader(){
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        String[] inArray = inputString.split("\\b");
    }
}
