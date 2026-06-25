import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calcolatrice calcolatrice = new Calcolatrice();

        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.print("Valore a: ");
        double a = scanner.nextDouble();

        System.out.print("Valore b: ");
        double b = scanner.nextDouble();
    }
}