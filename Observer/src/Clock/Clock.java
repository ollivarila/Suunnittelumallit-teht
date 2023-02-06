package Clock;

public class Clock extends Thread{

    private static final int CLOCK_MAX_VALUE = 86_400;
    private int time = 0;
    private boolean isRunning = true;

    private ClockController controller;

    public Clock(ClockController controller){
        this.controller = controller;
    };

    @Override
    public void run(){
        while(isRunning){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                isRunning = false;
                System.out.println("Clock thread interrupted");
                return;
            }
            this.time += 1;
            if(this.time >= CLOCK_MAX_VALUE) {
                this.time = 0;
            }
            this.controller.clockHasUpdated();
        }
    }

    public int getTime(){
        return this.time;
    }

    public void setTime(int time){
        this.time = time;
    }

}
