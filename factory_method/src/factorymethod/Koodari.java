package factorymethod;

public class Koodari extends AterioivaOtus{
    @Override
    public Juoma createJuoma() {
        return new Kahvi();
    }
}
