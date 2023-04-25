package org.example.ingredient;

public abstract class Ingredient implements HamburgerIngredient {
    private final String name;
    public Ingredient(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
