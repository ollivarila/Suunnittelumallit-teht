package pizza;

public class Kebab extends DecoratedPizza{

    private double price;
    private final String name = "kebab";


    public Kebab(Pizza pizza, double price) {
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
