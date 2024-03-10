public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        // && - koniunkcja - zwróci true, gdy dwie składowe są true
        // || - alternatywa (lub) - zwróci true, gdy jedna składowa jest true
        // ! - negacja - zwraca wartość przeciwną do wyrażenia, przed którym się znajduje

        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && thirdValue);
        System.out.println(firstValue || secondValue);
        System.out.println(secondValue || fourthValue);
        System.out.println(!firstValue);
        System.out.println(!secondValue);
        System.out.println(!firstValue && secondValue);

    }
}

