package Clock;

public class Main {
    public static void main(String[] args) {
        ClockController controller = new ClockController();

        ClockView view = new ClockView();

        controller.addObserver(view);

        controller.startClock();
    }
}