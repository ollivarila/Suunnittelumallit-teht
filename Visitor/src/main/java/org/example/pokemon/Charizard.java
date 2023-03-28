package org.example.pokemon;

public class Charizard extends PokemonState {
    @Override
    public void dealDamage(Pokemon pokemon) {
        System.out.println("Dealt 50 damage");
    }
    @Override
    String getName() {
        return "Charizard";
    }

    @Override
    int getMaxHealth() {
        return 500;
    }

    @Override
    public void takeDamage(Pokemon pokemon, int amount) {
        pokemon.setHealth(pokemon.getHealth() -amount);
    }

    @Override
    public double getBonusMultiplier() {
       return 3;
    }

    @Override
    int getXpRequired() {
        return 0;
    }

    @Override
    void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}
