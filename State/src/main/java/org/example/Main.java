package org.example;

import pokemon.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Pokemon pokemon = new Pokemon(new Charmander());
        int turns = 0;

        while(turns < 100){
            pokemon.attack();
            pokemon.takeDamage();
            Thread.sleep(500);
            turns++;
        }
    }
}