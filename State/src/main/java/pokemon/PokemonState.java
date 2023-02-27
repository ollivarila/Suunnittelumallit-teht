package pokemon;

public abstract class PokemonState {

    abstract void dealDamage(Pokemon pokemon);

    abstract String getName();

    abstract int getMaxHealth();

    abstract void takeDamage(Pokemon pokemon, int amount);

    void changeState(Pokemon p, PokemonState state){
        p.changeState(state);
    }


    abstract int getXpRequired();
}
