package org.example;

import org.example.pokemon.Charmander;
import org.example.pokemon.ConcretePokemonVisitor;
import org.example.pokemon.Pokemon;
import org.example.pokemon.PokemonVisitor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Pokemon pokemon = new Pokemon(new Charmander());
        PokemonVisitor visitor = new ConcretePokemonVisitor();
        int turns = 0;

        while(turns < 10){
            pokemon.attack();
            pokemon.takeDamage();
            Thread.sleep(500);
            turns++;
        }
        pokemon.accept(visitor);

        System.out.println("Pokemon bonus points " + pokemon.getBonusPoints());
    }
}