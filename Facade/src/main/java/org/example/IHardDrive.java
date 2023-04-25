package org.example;

public interface IHardDrive {
    void write(int address, byte data);
    byte read(int address);
}
