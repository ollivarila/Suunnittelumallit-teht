import effects.Effect;
import effects.EmptyEffect;

public class Player {
    private int currentPosition;
    private final int playerNumber;
    private Effect effect;

    @Override
    public String toString() {
        return String.format("Player %d, current position: %d, effect: %s", playerNumber, currentPosition, effect.toString());
    }

    public Player(int playerNumber){
        this.playerNumber = playerNumber;
        this.effect = new EmptyEffect();
        this.currentPosition = 0;
    }

    public void move(int increment){
        removeEffectIfOver();
        int valueAfterEffect = effect.modifyValue(increment);
        this.currentPosition += valueAfterEffect;
        if(valueAfterEffect > 0){
            System.out.println("Rolled " + increment);
            System.out.println("After effects the value is: " + valueAfterEffect);
            System.out.printf("Player %d moved %d spaces and is currently at position %d\n", playerNumber, valueAfterEffect, currentPosition);
        }
    }

    private void removeEffectIfOver(){
        if(!effect.isValid())
            this.effect = new EmptyEffect();
    }

    public void setEffect(Effect effect){
        this.effect = effect;
    }


    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getPlayerNumber(){
        return this.playerNumber;
    }
}
