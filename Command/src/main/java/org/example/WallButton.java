package org.example;

public class WallButton implements Button {

    private final Command command;
    public WallButton(Command command) {
       this.command = command;
    }
    @Override
    public void press() {
        command.execute();
    }
}
