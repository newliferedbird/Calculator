import java.util.Stack;

public class Calculated extends ManipulationString {
    Stack<String> result = new Stack<>();

    public void calculatedString(){
        while (polishNotation().size() > 0) {
            if (polishNotation().peek().equals("+") || polishNotation().peek().equals("-") || polishNotation().peek().equals("*") || polishNotation().peek().equals("/")) {
                switch (polishNotation().peek()) {
                    case ("+"):
                        polishNotation().pop();
                        int x1 = Integer.parseInt(result.pop());
                        int x2 = Integer.parseInt(result.pop());
                        int finalresult1 = x1 + x2;
                        result.add(Integer.toString(finalresult1));
                        break;
                    case ("-"):
                        polishNotation().pop();
                        x1 = Integer.parseInt(result.pop());
                        x2 = Integer.parseInt(result.pop());
                        finalresult1 = x1 - x2;
                        result.add(Integer.toString(finalresult1));
                        break;
                    case ("*"):
                        polishNotation().pop();
                        x1 = Integer.parseInt(result.pop());
                        x2 = Integer.parseInt(result.pop());
                        finalresult1 = x1 * x2;
                        result.add(Integer.toString(finalresult1));
                        break;
                    case ("/"):
                        polishNotation().pop();
                        x1 = Integer.parseInt(result.pop());
                        x2 = Integer.parseInt(result.pop());
                        finalresult1 = x1 / x2;
                        result.add(Integer.toString(finalresult1));
                        break;
                }
            } else {
                result.add(polishNotation().pop());
            }
        }
        System.out.print("Результат выражения: "+result);
    }
}
