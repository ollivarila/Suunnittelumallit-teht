package pizza;

public class Pepperoni extends DecoratedPizza{
    private double price;
    private final String name = "pepperoni";


    public Pepperoni(Pizza pizza, double price) {
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
