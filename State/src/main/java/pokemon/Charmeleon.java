package pokemon;

public class Charmeleon extends PokemonState {
    @Override
    public void dealDamage(Pokemon pokemon) {
        System.out.println("Dealt 20 damage");
        pokemon.gainXp(15);
        if(pokemon.getXpRequired() <= 0){
            changeState(pokemon, new Charizard());
        }
    }

    @Override
    String getName() {
        return "Charmeleon";
    }

    @Override
    int getMaxHealth() {
        return 200;
    }

    @Override
    public void takeDamage(Pokemon pokemon, int amount) {
        pokemon.setHealth(pokemon.getHealth() -amount);
        pokemon.gainXp(20);

        if(pokemon.getXpRequired() <= 0){
            changeState(pokemon, new Charizard());
        }
    }

    @Override
    int getXpRequired() {
        return 200;
    }
}
