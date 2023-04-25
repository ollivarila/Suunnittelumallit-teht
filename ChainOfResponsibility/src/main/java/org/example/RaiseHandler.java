package org.example;

public abstract class RaiseHandler {
    private RaiseHandler successor;

    public RaiseHandler(RaiseHandler successor) {
        this.successor = successor;
    }

    public void handleRaise(int current, int raise) {
        if (successor != null) {
            successor.handleRaise(current, raise);
        }
    }

    protected double calculatePercentage(int current, int raise) {
        return  (double) raise / (double) current * 100;
    }
}
