import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calcolatrice calcolatrice = new Calcolatrice();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valore A: ");
        double a = scanner.nextDouble();

        System.out.print("Valore B: ");
        double b = scanner.nextDouble();

        try {
            System.out.println(calcolatrice.quoziente(a, b));
        } catch (DivisionePerZeroException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
    }
}