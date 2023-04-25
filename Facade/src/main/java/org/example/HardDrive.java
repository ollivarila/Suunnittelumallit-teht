package org.example;

public class HardDrive implements IHardDrive {

    private byte[] data;
    private int top;

    public HardDrive() {
        data = new byte[1024];
        writeBoot();
    }

    private void writeBoot(){
        String hello = "Hello World!";
        while(top < hello.length()){
            data[top] = (byte) hello.charAt(top);
            top++;
        }
        data[top] = (byte) 0;
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
