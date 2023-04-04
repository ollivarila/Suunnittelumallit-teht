import java.util.List;

public interface ListConverter<T> {
    void listToString(List<T> list);
}
