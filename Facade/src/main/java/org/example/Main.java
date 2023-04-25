package org.example;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new Computer();
        computer.start();
        computer.reboot();
        computer.stop();
    }
}