package org.example;

public class Password {

    private String value;

    public Password(String password) {
        this.value = password;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
