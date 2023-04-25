package org.example;

import org.example.ingredient.Cheese;
import org.example.ingredient.Lettuce;
import org.example.ingredient.Patty;
import org.example.ingredient.Tomato;

public class McDonaldsHamburgerBuilder implements HamburgerBuilder<McDonaldsHamburger>{

    private final McDonaldsHamburger hamburger;
    public McDonaldsHamburgerBuilder() {
        this.hamburger = new McDonaldsHamburger();
    }

    @Override
    public HamburgerBuilder<McDonaldsHamburger> buildPatty() {
        hamburger.addIngredient(new Patty());
        return this;
    }

    @Override
    public HamburgerBuilder<McDonaldsHamburger> buildCheese() {
        hamburger.addIngredient(new Cheese());
        return this;
    }

    @Override
    public HamburgerBuilder<McDonaldsHamburger> buildLettuce() {
        hamburger.addIngredient(new Lettuce());
        return this;
    }

    @Override
    public HamburgerBuilder<McDonaldsHamburger> buildTomato() {
        hamburger.addIngredient(new Tomato());
        return this;
    }

    @Override
    public McDonaldsHamburger getHamburger() {
        return hamburger;
    }
}
