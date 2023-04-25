package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");
        Iterator<String> iterator = list.iterator();
        iterator.remove();
        Runnable r = () -> {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}