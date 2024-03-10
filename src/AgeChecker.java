import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int wiek = scanner.nextInt();

        if(wiek >= 18) {
            System.out.println("Udanych zakupów");
        } else {
            System.out.println("Dorośnij!");
        }
    }
}
