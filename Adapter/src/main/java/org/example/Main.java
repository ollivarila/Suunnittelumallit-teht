package org.example;

public class Main {
    public static void main(String[] args) {

        BasicKey basic = new BasicKey("1234");
        SaltedKey salted = new SaltedKey(basic);

        System.out.println(basic);
        System.out.println(salted);
    }
}