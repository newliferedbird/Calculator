import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class CalcMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();

        String[] inArray = inputString.split("\\b");

        Stack<String> inStack = new Stack<>();
        Stack<String> outStack = new Stack<>();
        Stack<String> result = new Stack<>();

        for (String val : inArray) {
            if (val.equals("+") || val.equals("-") || val.equals("*") || val.equals("/")) {

                switch (val) {
                    case ("+"):
                    case ("/"):
                    case ("-"):
                    case ("*"):
                        trycatch(inStack, outStack, val);
                        break;
                }

            } else {
                outStack.add(val);
            }
        }

        formingOutStack(inStack, outStack);

        Calculated(outStack, result);

        System.out.println(Integer.parseInt(result.pop()));

    }

    public static void trycatch(Stack<String> inStack, Stack<String> outStack, String val) {

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

    public static void formingOutStack(Stack<String> inStack, Stack<String> outStack) {
        while (inStack.size() > 0) {
            outStack.add(inStack.pop());
        }
    }

    public static void Calculated(Stack<String> outStack, Stack<String> result) {

        while (outStack.size() > 0) {
            if (outStack.peek().equals("+") || outStack.peek().equals("-") || outStack.peek().equals("*") || outStack.peek().equals("/")) {
                switch (outStack.peek()) {
                    case ("+"):
                        int x1 = Integer.parseInt(result.pop());
                        int x2 = Integer.parseInt(result.pop());
                        int finalresult1 = x1 + x2;
                        result.add(Integer.toString(finalresult1));
                        break;
                    case ("-"):
                        int x3 = Integer.parseInt(result.pop());
                        int x4 = Integer.parseInt(result.pop());
                        int finalresult2 = x3-x4;
                        result.add(Integer.toString(finalresult2));
                        break;
                    case ("*"):
                        int x5 = Integer.parseInt(result.pop());
                        int x6 = Integer.parseInt(result.pop());
                        int finalresult3 = x5*x6;
                        result.add(Integer.toString(finalresult3));
                        break;
                    case ("/"):
                        int x7 = Integer.parseInt(result.pop());
                        int x8 = Integer.parseInt(result.pop());
                        int finalresult4 = x7/x8;
                        result.add(Integer.toString(finalresult4));
                        break;
                }
            }
            else {
                result.add(outStack.pop());
            }
        }
    }
}




