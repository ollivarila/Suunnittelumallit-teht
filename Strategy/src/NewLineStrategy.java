import java.util.Iterator;
import java.util.List;

public class NewLineStrategy<T> extends AbstractConverter<T> {

    public NewLineStrategy() {
    }

    @Override
    public void listToString(List<T> list) {
        resetBuilder();
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            appendWithNewline(iterator.next());
        }
        String result = super.builder.toString();
        printResult(result);
    }
    private void appendWithNewline(T value) {
        super.builder.append(String.format("%s\n", value.toString()));
    }
}