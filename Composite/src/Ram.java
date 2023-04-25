public class Ram implements Component{
    private double price;

    public Ram(double price) {
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
