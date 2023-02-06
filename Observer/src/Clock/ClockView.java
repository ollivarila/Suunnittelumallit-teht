package Clock;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class ClockView implements Observer {

    private String time;
    @Override
    public void update(Observable o, Object arg) {
        this.time = ((ClockController) o).getTimeString();
        printTime();
    }


    public void printTime(){
        System.out.println("Time is: " + time);
    }



}
