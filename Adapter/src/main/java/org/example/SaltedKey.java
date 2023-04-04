package org.example;

public class SaltedKey implements IKey{

    private final BasicKey legacyKey;
    private final String salt;

    public SaltedKey(BasicKey legacyKey) {
        this.legacyKey = legacyKey;
        this.salt = genSalt();
    }

    @Override
    public Password getPassword() {
        return new Password(legacyKey.getPassword().getValue() + salt);
    }

    private String genSalt() {
        StringBuilder salt = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            salt.append((char) (Math.random() * 26 + 'a'));
        }
        return salt.toString();
    }

    @Override
    public String toString() {
        return "Salted key: " +  legacyKey.getPassword() + salt;
    }
}
