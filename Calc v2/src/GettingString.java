import java.util.Scanner;

public class GettingString {

    public String inputString(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        return scan.nextLine();
    }
}
