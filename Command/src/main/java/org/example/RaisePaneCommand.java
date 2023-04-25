package org.example;

public class RaisePaneCommand implements Command {

    private final Pane pane;

    public RaisePaneCommand(Pane pane) {
        this.pane = pane;
    }

    @Override
    public void execute() {
        pane.raise();
    }
}
