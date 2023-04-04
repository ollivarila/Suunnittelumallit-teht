package effects;

import java.util.ArrayList;
import java.util.List;

public class EffectFactoryImpl implements EffectFactory {

    private final List<Effect> effects = new ArrayList<>();
    public EffectFactoryImpl(){
        effects.add(new NoMove());
        effects.add(new DoublePoints());
    }
    @Override
    public Effect getRandomEffect() {
        return effects.get(randomPosition()).newInstance();
    }

    public int randomPosition(){
        return (int) Math.floor((Math.random() * effects.size()));
    }

}
