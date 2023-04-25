package org.example;

public class Main {
    public static void main(String[] args) {
        Pane pane = new Pane();
        Command raisePaneCommand = new RaisePaneCommand(pane);
        Command lowerPaneCommand = new LowerPaneCommand(pane);
        Button raiseButton = new WallButton(raisePaneCommand);
        Button lowerButton = new WallButton(lowerPaneCommand);
        raiseButton.press();
        lowerButton.press();
    }
}