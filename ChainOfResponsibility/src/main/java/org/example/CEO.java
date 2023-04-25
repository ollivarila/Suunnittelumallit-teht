package org.example;

public class CEO extends RaiseHandler
{

    public CEO() {
        super(null);
    }

    @Override
    public void handleRaise(int current, int raise) {
        double percentage = calculatePercentage(current, raise);
            System.out.println("CEO approved raise of " + percentage + "%");
    }
}
