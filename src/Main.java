public class Main {
    public static void main(String[] args) {
        Calcolatrice calcolatrice = new Calcolatrice();

        try {
            calcolatrice.quoziente(2, 0)
        } catch (DivisionePerZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}