public class NetworkInterfaceCard implements Component{
    private double price;

    public NetworkInterfaceCard(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void printPrice() {
        System.out.println(this.price);
    }
}
