package Clock;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class ClockController extends Observable {

    private Clock clock;
    public ClockController(){
        super();
        this.clock = new Clock(this);
    }

    public void setClock(int time) {
        clock.setTime(time);
    }

    public void clockHasUpdated(){
        setChanged();
        notifyObservers();
    }

    public void startClock(){
        this.clock.start();
    }

    public int getHours(){
        return (int) Math.floor(clock.getTime() / 60 / 60);
    }

    public int getMinutes(){
        int mins = clock.getTime() / 60;
        int displayMins = mins - (60 * getHours());
        return displayMins;
    }

    public int getSeconds(){
       int sec = clock.getTime();
       int min = sec / 60;
       if(min > 0) {
           sec = sec - (60 * min);
       }
       return sec;
    }

    public String getTimeString() {
        int hours = getHours();
        int min = getMinutes();
        int sec = getSeconds();

        String secStr;
        if(sec < 10) {
            secStr = "0" + sec;
        } else {
            secStr = Integer.toString(sec);
        }
        String minStr;
        if(min < 10) {
            minStr = "0" + min;
        } else {
            minStr = Integer.toString(min);
        }
        return String.format("%d:%s:%s", hours, minStr, secStr);
    }
}
