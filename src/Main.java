import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calcolatrice calcolatrice = new Calcolatrice();

        Scanner scanner = new Scanner(System.in);

        // valori di default, inizializzazione prima di assegnazione
        int opzione = 0;
        double a = 0;
        double b = 0;
        // menu
        System.out.println("Selezionare l'opzione del calcolo da eseguire");

        System.out.printf("%-20s %d%n", "Addizione:", 1);
        System.out.printf("%-20s %d%n", "Sottrazione:", 2);
        System.out.printf("%-20s %d%n", "Moltiplicazione:", 3);
        System.out.printf("%-20s %d%n", "Divisione:", 4);
        System.out.printf("%-20s %d%n", "Uscita:", 0);
        System.out.printf("Inserire opzione: ");
        opzione = scanner.nextInt();
        if (opzione != 0) {
            // user input
            System.out.print("Valore a: ");
            a = scanner.nextDouble();

            System.out.print("Valore b: ");
            b = scanner.nextDouble();
        }
        switch (opzione) {
            case 1 -> System.out.println(calcolatrice.somma(a, b));
            case 2 -> System.out.println(calcolatrice.differenza(a, b));
            case 3 -> System.out.println(calcolatrice.prodotto(a, b));
            case 4 -> {
                try {
                    System.out.println(calcolatrice.quoziente(a, b));
                } catch (DivisionePerZeroException e) {
                    System.out.println(e.getMessage());
                }
            }
            default -> System.out.println("Opzione non valida.");
        }
        ;
    }
}