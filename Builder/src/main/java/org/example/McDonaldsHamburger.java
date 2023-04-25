package org.example;

import org.example.ingredient.HamburgerIngredient;

public class McDonaldsHamburger {

    private final StringBuilder ingredients;

    public McDonaldsHamburger() {
        ingredients = new StringBuilder();
        ingredients.append("McDonalds Hamburger: ");
    }

    public void addIngredient(HamburgerIngredient ingredient){
        ingredients.append(ingredient.getName()).append(", ");
    }

    @Override
    public String toString(){
        return ingredients.toString();
    }
}
