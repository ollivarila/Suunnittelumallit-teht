package pizza;

public abstract class DecoratedPizza implements Pizza{
    protected Pizza pizzaToDecorate;

    public DecoratedPizza(Pizza pizza){
        this.pizzaToDecorate = pizza;
    }

    @Override
    public double getPrice() {
       return pizzaToDecorate.getPrice();
    }

    @Override
    public String getIngredients() {
        return pizzaToDecorate.getIngredients();
    }
}
