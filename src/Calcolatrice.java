public class Calcolatrice {
    public double somma(double a, double b) {
        return a + b;
    }

    public double differenza(double a, double b) {
        return a - b;
    }
    public double prodotto(double a, double b) {
        return a * b;
    }
    public double quoziente(double a, double b) {
        if (b == 0){
            throw new DivisionePerZeroException("Impossibile dividere per zero.");
        } else {
            return a / b;
        }
    }
}
