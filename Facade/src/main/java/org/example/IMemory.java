package org.example;

public interface IMemory {
    void write(int address, byte data);

    byte read(int address);
}
