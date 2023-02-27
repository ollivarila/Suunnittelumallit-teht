package pizza;

public class Ham extends DecoratedPizza{


    private double price;
    private final String name = "ham";


    public Ham(Pizza pizza, double price) {
        super(pizza);
        this.price = price;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + " + this.name;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.price;
    }
}
