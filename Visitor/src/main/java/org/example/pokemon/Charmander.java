package org.example.pokemon;

public class Charmander extends PokemonState{
    @Override
    public void dealDamage(Pokemon pokemon) {
        System.out.println("Dealt 10 damage");
        pokemon.gainXp(10);
        if(pokemon.getXpRequired() <= 0){
            changeState(pokemon, new Charmeleon());
        }
    }
    @Override
    public double getBonusMultiplier() {
        return 1;
    }

    @Override
    String getName() {
        return "Charmander";
    }

    @Override
    int getMaxHealth() {
        return 100;
    }

    @Override
    public void takeDamage(Pokemon pokemon, int amount) {
        pokemon.setHealth(pokemon.getHealth() -amount);
        pokemon.gainXp(10);

        if(pokemon.getXpRequired() <= 0){
            changeState(pokemon, new Charmeleon());
        }

    }

    @Override
    int getXpRequired() {
        return 100;
    }

    @Override
    void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}
