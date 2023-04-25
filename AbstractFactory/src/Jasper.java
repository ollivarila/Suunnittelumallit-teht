public class Jasper {
    private Vaate lippis;
    private Vaate tpaita;
    private Vaate housut;
    private Vaate kengat;

    public Jasper(VaateFactory vaateFactory) {
        this.lippis = vaateFactory.luoLippis();
        this.tpaita = vaateFactory.luoTpaita();
        this.housut = vaateFactory.luoHousut();
        this.kengat = vaateFactory.luoKengat();
    }

    public void lueMerkit(){
        System.out.println("Lippis on " + lippis + " T-paita on " + tpaita + " Housut on " + housut + " Kengat on " + kengat);
    }
}
