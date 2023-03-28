package effects;

public class DoublePoints extends BaseEffect{

    public DoublePoints(){
        super(2);
    }
    @Override
    public int modifyValue(int value) {
        turnHasPassed();
        return value * 2;
    }

    @Override
    public Effect newInstance() {
       return new DoublePoints();
    }

    @Override
    public String toString() {
        return "Double points";
    }
}
