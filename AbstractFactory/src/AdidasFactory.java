
public class AdidasFactory extends VaateFactory {

    private final String merkki = "Adidas";
    @Override
    public Vaate luoLippis() {
        return new Lippis(merkki);
    }

    @Override
    public Vaate luoKengat() {
        return new Kengat(merkki);
    }

    @Override
    public Vaate luoHousut() {
        return new Housut(merkki);
    }

    @Override
    public Vaate luoTpaita() {
        return new Tpaita(merkki) ;
    }
}
