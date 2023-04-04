package org.example;

public interface HamburgerBuilder<T> {
    HamburgerBuilder<T> buildPatty();
    HamburgerBuilder<T> buildCheese();
    HamburgerBuilder<T> buildLettuce();
    HamburgerBuilder<T> buildTomato();
    T getHamburger();
}
