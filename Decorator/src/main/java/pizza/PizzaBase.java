package pizza;

public class PizzaBase implements Pizza{

    private double price;
    private final String name = "Base";

    public PizzaBase(double price) {
        this.price = price;
    }

    @Override
    public String getIngredients() {
        return this.name;
    }

    @Override
    public double getPrice(){
        return this.price;
    }
}
