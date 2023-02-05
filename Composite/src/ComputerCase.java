import java.util.ArrayList;
import java.util.List;

public class ComputerCase implements Component{

    private double price;
    private List<Component> componentList;

    public ComputerCase(double price) {
        this.price = price;
        this.componentList = new ArrayList<>();
    }

    @Override
    public double getPrice() {
        double total = price;
        for (Component c : componentList){
            total += c.getPrice();
        }
        return total;
    }

    @Override
    public void printPrice() {
        System.out.println("Computer case price: " + getPrice());
    }

    public void addComponent(Component c){
        componentList.add(c);
    }
}
