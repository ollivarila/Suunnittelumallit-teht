package org.example;

public class Computer implements ComputerFacade {

    private ICPU cpu;
    private IMemory memory;
    private IHardDrive hardDrive;

    private final byte END = 0;

    private final int BOOT_ADDRESS = 0;

    public Computer() {
        memory = new Memory();
        cpu = new CPU(memory);
        hardDrive = new HardDrive();
    }


    @Override
    public void start() {
        System.out.println("Starting computer...");
        boot();
        cpu.freeze();
        System.out.println("Computer started.");
    }

    @Override
    public void stop() {
        System.out.println("Computer stopped");
    }

    @Override
    public void reboot() {
        stop();
        start();
    }

    private void boot(){
        System.out.println("Booting computer...");
        cpu.freeze();
        loadBootSector();
        int address = BOOT_ADDRESS;
        while(memory.read(address) != END){
            cpu.jump(address);
            cpu.execute();
            address++;
        }
        System.out.println("Computer booted.");
    }

    private void loadBootSector() {
        System.out.println("Loading boot sector...");
        int address = BOOT_ADDRESS;
        byte data;
        do {
            data = hardDrive.read(address);
            memory.write(address, data);
            address++;
        } while (data != END);
        System.out.println("Boot sector loaded.");
    }
}
