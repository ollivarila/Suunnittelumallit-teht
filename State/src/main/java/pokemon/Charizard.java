package pokemon;

public class Charizard extends PokemonState{
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
    int getXpRequired() {
        return 0;
    }
}
