package org.example;

import java.util.Objects;

public class RealImage implements Image{

    private final String filename;

    public RealImage(String filename) {
        this.filename = Objects.requireNonNull(filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Showing data of " + filename);
    }

}

