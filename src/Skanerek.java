import java.util.Scanner;

public class Skanerek {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj imię mordo");
//        String name = scanner.nextLine();
//        System.out.println("Siema " + name + " !");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę mordo");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to " + result);

    }
}
