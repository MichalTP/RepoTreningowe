//import java.util.Scanner;
//
//public class Kalkulator {
//    public static void main(String[] args) {
//
//        float thirdNumber = 4.0F;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj imię mordo");
//        String name = scanner.nextLine();
//        System.out.println("Siema " + name + " !");
//
//        System.out.println("Witam Cię " + name + " w tym wspaniałym kalkulatorze");
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Podaj pierwszą liczbę mordo");
//        int firstNumber = scanner.nextInt();
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Podaj drugą liczbę mordo");
//        int secondNumber = scanner.nextInt();
//
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("Co chcesz z nimi zrobić mordo? (dodać, odjąć, pomnożyć, podzielić)");
//        String dzialanie = scanner.nextLine();
//
//
//        int addition = firstNumber + secondNumber;
//        int subtraction = firstNumber - secondNumber;
//        int multiplication = firstNumber * secondNumber;
//        float division = thirdNumber/secondNumber;
//        int mod = secondNumber&firstNumber;
//
//        do {System.out.println("Wynik dodawania to " + addition);
//        }
//        while(dzialanie.matches("dodać"));
//
//        do {System.out.println("Wynik odejmowania to " + subtraction);
//        }
//        while(dzialanie.matches("odjąć"));
//
//        do {System.out.println("Wynik mnożenia to " + multiplication);
//        }
//        while(dzialanie.matches("pomnożyć"));
//
//        do {System.out.println("Wynik dzielenia to " + division);
//        }
//        while(dzialanie.matches("podzielić"));
//
//    }
//}
