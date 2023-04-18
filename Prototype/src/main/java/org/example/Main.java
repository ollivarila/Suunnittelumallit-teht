package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        System.out.println("Deep copy start");
        Clock clock = new Clock();
        clock.setTimeToNow();
        Clock clone = clock.clone();
        Date date = new Date();
        date.setTime(0);
        clone.setTime(date);
        clock.start();
        clone.start();
        Thread.sleep(10000);
        clock.stopClock();
        clone.stopClock();
        clone.join();
        clock.join();
        System.out.println("Deep copy end");

        System.out.println("Shallow copy start");
        Clock clock2 = new Clock();
        Clock clone2 = clock2.shallowClone();
        clone2.setTime(date);
        clock2.start();
        clone2.start();
        Thread.sleep(10000);
        clock2.stopClock();
        clone2.stopClock();
        clone2.join();
        clock2.join();
        System.out.println("Shallow copy end");
    }
}