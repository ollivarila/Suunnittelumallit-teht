package org.example;

import pizza.*;

public class Main {
    public static void main(String[] args) {

        Pizza base = new PizzaBase(5);

        Pizza hawaiji = new Ananas(new Ham(base, 2.5), 2.5);
        Pizza pepperoni = new Pepperoni(base, 3);
        Pizza meat = new Ham(new Pepperoni(new Kebab(base, 2.5), 3), 2.5);



        printPizza(hawaiji);
        printPizza(pepperoni);
        printPizza(meat);
    }

    private static void printPizza(Pizza pizza){
        System.out.printf("Pizza ingredients: %s\n", pizza.getIngredients());
        System.out.printf("Pizza price: %f\n", pizza.getPrice());
    }
}