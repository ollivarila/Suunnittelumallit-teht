package org.example;

import java.util.Objects;

public class ProxyImage implements Image{

    private final String filename;
    private Image image;

    public ProxyImage(String filename) {
        this.filename = Objects.requireNonNull(filename);
    }

    private void loadImage(){
        if(image == null){
            image = new RealImage(filename);
            System.out.println("Loading " + filename);
        }
    }

    @Override
    public void displayImage() {
        loadImage();
        image.displayImage();
    }

    @Override
    public void showData() {
        System.out.println("Showing data of " + filename);
    }
}
