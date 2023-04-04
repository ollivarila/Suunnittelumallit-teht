package effects;

public abstract class BaseEffect implements Effect {

    private int turnsRemaining;

    public BaseEffect(int turnsRemaining){
        this.turnsRemaining = turnsRemaining;
    }
    protected void turnHasPassed(){
        this.turnsRemaining -= 1;
    }
    @Override
    public boolean isValid(){
        return turnsRemaining > 0;
    }
}
