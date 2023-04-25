import java.util.Iterator;
import java.util.List;

public class NewLineEveryotherStrategy<T> extends AbstractConverter<T>{

    private int index = 0;
    public NewLineEveryotherStrategy(){

    }

    @Override
    public void listToString(List<T> list) {
        resetBuilder();
        T[] values = (T[]) list.toArray();

        for(index = 0 ; index < values.length; index++){
           appendEveryOtherNewline(values[index]);
        }
        String result = builder.toString();
        printResult(result);
    }

    private void appendEveryOtherNewline(T value){
        if(index % 2 == 1) {
            super.builder.append(String.format("%s\n", value.toString()));
        } else {
            super.builder.append(value.toString());
        }
    }
}
