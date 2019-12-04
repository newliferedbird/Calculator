import java.io.IOException;

public class OutputClass extends GettingString {
    public static void main(String[] args) throws IOException {
        for(;;) {
            Calculated calculated = new Calculated();
            System.out.println("Результат вычисления: " + calculated.calculatedString());
        }
    }
}
