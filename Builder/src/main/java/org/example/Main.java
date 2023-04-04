package org.example;

public class Main {
    public static void main(String[] args) {
        HesburgerHamburgerBuilder hesburgerBuilder = new HesburgerHamburgerBuilder();
        McDonaldsHamburgerBuilder mcDonaldsBuilder = new McDonaldsHamburgerBuilder();


        hesburgerBuilder.buildCheese().buildTomato().buildPatty().buildLettuce();
        HesburgerHamburger burger = hesburgerBuilder.getHamburger();

        mcDonaldsBuilder.buildPatty().buildLettuce().buildTomato().buildCheese().buildPatty().buildCheese();
        McDonaldsHamburger burger2 = mcDonaldsBuilder.getHamburger();

        System.out.println(burger);
        System.out.println(burger2);
    }
}