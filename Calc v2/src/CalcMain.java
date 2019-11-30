import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class CalcMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder output = new StringBuilder();
        String[] strings = input.split("\\b");
        Stack<String> stringStack = new Stack<>();
        for (String string : strings) {
            if (string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/")) {
                switch (string) {
                    case ("+"):
                        try {
                            if (stringStack.peek().equals("^") || stringStack.peek().equals("*") || stringStack.peek().equals("/")) {
                                output.append(stringStack.pop());
                                stringStack.add(string);
                            } else {
                                stringStack.add(string);
                            }
                        } catch (EmptyStackException e) {
                            stringStack.add(string);
                        }
                        break;
                    case ("-"):
                        if (stringStack.peek().equals("^") || stringStack.peek().equals("*") || stringStack.peek().equals("/")) {
                            output.append(stringStack.pop());
                            stringStack.add(string);
                        } else {
                            stringStack.add(string);
                        }
                        break;
                    case ("*"):
                        if (stringStack.peek().equals("^") || stringStack.peek().equals("*") || stringStack.peek().equals("/")) {
                            output.append(stringStack.pop());
                            stringStack.add(string);
                        } else {
                            stringStack.add(string);
                        }
                        break;
                    case ("/"):
                        if (stringStack.peek().equals("^") || stringStack.peek().equals("*") || stringStack.peek().equals("/")) {
                            output.append(stringStack.pop());
                            stringStack.add(string);
                        } else {
                            stringStack.add(string);
                        }
                        break;
                }
//                output += strings[i];
            } else {
                output.append(string);
            }
        }
        while (stringStack.size() > 0) {
            output.append(stringStack.pop());
        }
        System.out.println(output);
    }
}
//if(stringStack.search("/")!=-1)