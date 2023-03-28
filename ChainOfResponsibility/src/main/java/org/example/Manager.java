package org.example;

public class Manager extends RaiseHandler{

    private static final int MAX_RAISE = 2;

    public Manager(RaiseHandler successor) {
        super(successor);
    }

    @Override
    public void handleRaise(int current, int raise) {
        double percentage = calculatePercentage(current, raise);
        if(percentage <= MAX_RAISE) {
            System.out.println("Manager approved raise of " + percentage + "%");
        } else {
            super.handleRaise(current, raise);
        }
    }


}
