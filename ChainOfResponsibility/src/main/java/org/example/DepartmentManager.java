package org.example;

public class DepartmentManager extends RaiseHandler{

    private static final int MAX_RAISE = 5;

    public DepartmentManager(RaiseHandler successor) {
        super(successor);
    }

    @Override
    public void handleRaise(int current, int raise) {
        double percentage = calculatePercentage(current, raise);
        if(percentage <= MAX_RAISE) {
            System.out.println("Department Manager approved raise of " + percentage + "%");
        } else {
            super.handleRaise(current, raise);
        }
    }
}
