package org.example;

import org.example.ingredient.HamburgerIngredient;

import java.util.ArrayList;
import java.util.List;

public class HesburgerHamburger {
    private final List<HamburgerIngredient> ingredients;

    public HesburgerHamburger(){
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(HamburgerIngredient ingredient){
        this.ingredients.add(ingredient);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hesburger hamburger with ingredients: ");
        for (HamburgerIngredient ingredient : ingredients) {
            sb.append(ingredient.toString()).append(", ");
        }
        return sb.toString();
    }
}
