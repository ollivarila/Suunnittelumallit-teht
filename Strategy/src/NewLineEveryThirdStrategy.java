import java.util.List;

public class NewLineEveryThirdStrategy<T> extends AbstractConverter<T>{

    private int index = 0;
    @Override
    public void listToString(List<T> list) {
        resetBuilder();
        for(index = 0; index < list.size(); index++){
            T value = list.get(index);
            appendNewlineEveryThird(value);
        }
        String result = super.builder.toString();
        printResult(result);
    }

    private void appendNewlineEveryThird(T value){
        if(index % 3 == 2){
            super.builder.append(String.format("%s\n", value.toString()));
        } else {
            super.builder.append(value.toString());
        }
    }

}
