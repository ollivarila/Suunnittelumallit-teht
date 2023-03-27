package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Image> images = new ArrayList<>();

        images.add(new ProxyImage("image1.jpg"));
        images.add(new ProxyImage("image2.jpg"));

        for (Image image : images) {
            image.showData();
        }
    }
}