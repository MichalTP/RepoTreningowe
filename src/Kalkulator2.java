import java.util.Scanner;
public class Kalkulator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = firstNumber/secondNumber;
        int mod = firstNumber&secondNumber;

        System.out.println("Dodawanie = " + addition);
        System.out.println("Odejmowanie = " + subtraction);
        System.out.println("Mnożenie = " + multiplication);
        System.out.println("Dzielenie = " + division);
        System.out.println("Reszta = " + mod);
    }
}
