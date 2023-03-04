package effects;

public interface Effect {
    int modifyValue(int value);
    boolean isValid();

    Effect newInstance();
}
