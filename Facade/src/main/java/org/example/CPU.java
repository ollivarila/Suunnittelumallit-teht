package org.example;

public class CPU implements ICPU {

    private IMemory memory;
    private byte instruction;
    public CPU(IMemory memory) {
        this.memory = memory;
    }
    public void freeze() {
    }

    public void jump(int position) {
        instruction = memory.read(position);
    }

    public void execute() {
        System.out.println((char)instruction);
    }
}
