public class Tpaita extends Vaate{
    private String merkki;

    public Tpaita(String merkki) {
        this.merkki = merkki;
    }
    @Override
    public String toString() {
        return this.merkki;
    }
}
