import java.util.Scanner;

public class GettingString {

    public String inputString(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String x = scan.nextLine();
        if(x.equals("Хватит.")){
            System.out.println("Ладно, пока, хозяин :)");
            System.exit(0);
        }
        else {
            return x;
        }
        return "Неверный формат выражения.";
    }
}
