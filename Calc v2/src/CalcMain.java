import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class CalcMain {

    public static void main(String[] args) {

        SupportFunc sf = new SupportFunc();

        sf.inputreader();

        Stack<String> inStack = new Stack<>();
        Stack<String> outStack = new Stack<>();
        Stack<String> result = new Stack<>();
        Stack<String> finalresult = new Stack<>();

        sf.sortArray(inArray,inStack,outStack,sf);

        sf.formingOutStack(inStack, outStack, finalresult);

        sf.Calculated(finalresult, result);

        System.out.println(Integer.parseInt(result.pop()));

    }
    public void inputreader(){
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        String[] inArray = inputString.split("\\b");
    }


}




