package org.example;

public class BasicKey implements IKey {

    private Password password;

    public BasicKey(String password) {
        this.password = new Password(password);
    }
    @Override
    public Password getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Basic key: " +  password;
    }
}
