package org.example;

public class Arrow implements IArrow, Cloneable {

    private int currentTime;

    private final int maxTime;

    public Arrow(int maxTime) {
        this.maxTime = maxTime;
    }


    @Override
    public void move() {
        currentTime++;
        if (currentTime == maxTime) {
            currentTime = 0;
        }
    }

    @Override
    public int getTime() {
        return currentTime;
    }

    public void setTime(int time) {
        currentTime = time;
    }

    @Override
    public Arrow clone() throws CloneNotSupportedException {
        Arrow arrow = (Arrow) super.clone();
        arrow.setTime(currentTime);
        return arrow;
    }
}
