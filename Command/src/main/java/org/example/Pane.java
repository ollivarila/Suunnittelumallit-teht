package org.example;

public class Pane {

    private boolean raised = false;

    public Pane() {
    }
    public void raise() {
        if(raised) {
            System.out.println("Pane already raised!");
        } else {
            System.out.println("Pane raised!");
            raised = true;
        }
    }

    public void lower() {
        if(raised) {
            System.out.println("Pane lowered!");
            raised = false;
        } else {
            System.out.println("Pane already lowered!");
        }
    }
}
