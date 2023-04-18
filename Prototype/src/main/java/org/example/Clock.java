package org.example;

import java.util.Date;

public class Clock extends Thread implements IClock, Cloneable{

    private final Arrow hourArrow;
    private final Arrow minuteArrow;
    private final Arrow secondArrow;
    private boolean isRunning = false;

    public Clock(Arrow hourArrow, Arrow minuteArrow, Arrow secondArrow) {
        this.hourArrow = hourArrow;
        this.minuteArrow = minuteArrow;
        this.secondArrow = secondArrow;
    }

    public Clock() {
        this.hourArrow = new Arrow(23);
        this.minuteArrow = new Arrow(60);
        this.secondArrow = new Arrow(60);
    }

    @Override
    public String getTime() {
        return String.format("%d:%d:%d", hourArrow.getTime(), minuteArrow.getTime(), secondArrow.getTime());
    }

    @Override
    public void setTime(Date time) {
        int seconds = (int) (time.getTime() / 1000);
        int minutes = seconds / 60;
        int hours = minutes / 60;
        secondArrow.setTime(seconds % 60);
        minuteArrow.setTime(minutes % 60);
        hourArrow.setTime(hours % 24);
    }

    @Override
    public void run() {
        isRunning = true;
        while(isRunning){
            moveArrows();
            sleepOneSec();
            printTime();
        }
    }

    private void sleepOneSec(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Clock clock interrupted");
            isRunning = false;
        }
    }

    private void printTime() {
        System.out.println(getTime());
    }

    @Override
    public void stopClock() {
        isRunning = false;
    }

    @Override
    public void setTimeToNow() {
        setTime(new Date());
    }

    private void moveArrows() {
        secondArrow.move();
        if (secondArrow.getTime() == 0) {
            minuteArrow.move();
            if (minuteArrow.getTime() == 0) {
                hourArrow.move();
            }
        }
    }

    private Clock deepCopy() throws CloneNotSupportedException {
        return new Clock(hourArrow.clone(), minuteArrow.clone(), secondArrow.clone());
    }

    private Clock shallowCopy() {
        return new Clock(hourArrow, minuteArrow, secondArrow);
    }

    @Override
    public Clock clone() throws CloneNotSupportedException {
        return deepCopy();
    }

    public Clock shallowClone() {
        return shallowCopy();
    }
}
