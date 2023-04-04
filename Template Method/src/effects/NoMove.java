package effects;

public class NoMove extends BaseEffect{

    public NoMove(){
        super(3);
    }

    @Override
    public int modifyValue(int value) {
        turnHasPassed();
        return 0;
    }

    @Override
    public Effect newInstance() {
        return new NoMove();
    }

    @Override
    public String toString() {
        return "No Moving";
    }
}
