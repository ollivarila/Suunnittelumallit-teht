package effects;

public class EmptyEffect implements Effect {

    @Override
    public int modifyValue(int value) {
       return value;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public Effect newInstance() {
       return this;
    }

    @Override
    public String toString(){
        return "no effect";
    }
}
