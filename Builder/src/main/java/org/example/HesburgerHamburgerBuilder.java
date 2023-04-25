package org.example;

import org.example.ingredient.Cheese;
import org.example.ingredient.Lettuce;
import org.example.ingredient.Patty;
import org.example.ingredient.Tomato;

public class HesburgerHamburgerBuilder implements HamburgerBuilder<HesburgerHamburger> {

    private final HesburgerHamburger burger;

    public HesburgerHamburgerBuilder() {
        this.burger = new HesburgerHamburger();
    }

    @Override
    public HesburgerHamburgerBuilder buildPatty() {
       burger.addIngredient(new Patty());
       return this;
    }

    @Override
    public HesburgerHamburgerBuilder buildCheese() {
        burger.addIngredient(new Cheese());
        return this;
    }

    @Override
    public HesburgerHamburgerBuilder buildLettuce() {
        burger.addIngredient(new Lettuce());
        return this;
    }

    @Override
    public HesburgerHamburgerBuilder buildTomato() {
        burger.addIngredient(new Tomato());
        return this;
    }

    @Override
    public HesburgerHamburger getHamburger() {
        return burger;
    }
}
