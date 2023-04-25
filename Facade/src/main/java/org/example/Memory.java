package org.example;

public class Memory implements IMemory {

    private byte[] data;

    public Memory() {
        data = new byte[128];
    }

    @Override
    public void write(int address, byte data) {
        this.data[address] = data;
    }

    @Override
    public byte read(int address) {
        return data[address];
    }
}
