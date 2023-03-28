package org.example.pokemon;

public abstract class PokemonState {

    abstract void dealDamage(Pokemon pokemon);

    abstract String getName();

    abstract int getMaxHealth();

    abstract void takeDamage(Pokemon pokemon, int amount);

    void changeState(Pokemon p, PokemonState state){
        p.changeState(state);
    }

    public abstract double getBonusMultiplier();


    abstract int getXpRequired();

    abstract void accept(PokemonVisitor visitor);
}
