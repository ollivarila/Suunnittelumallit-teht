import java.util.ArrayList;
import java.util.List;

public class Context {

    private List<Double> values;

    private ListConverter<Double> converter;

    public Context(){
       initValues();
    }

    private void initValues(){
        this.values = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            values.add(Math.random());
        }
    }
    public void setConverter(ListConverter<Double> converter){
       this.converter = converter;
    }

    public void useStrategy(){
        converter.listToString(values);
    }



}
