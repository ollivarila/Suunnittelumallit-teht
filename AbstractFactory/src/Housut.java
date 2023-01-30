public class Housut extends Vaate {
    private String merkki;

    public Housut(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return this.merkki;
    }
}