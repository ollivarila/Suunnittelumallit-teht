package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();

        AterioivaOtus jonne = new Jonne();
        jonne.aterioi();

        AterioivaOtus koodari = new Koodari();
        koodari.aterioi();
        

    }
}
