public class Worker implements Runnable {

    private final int target;
    private int count;

    public Worker(){
        this.target = ThreadManager.getInstance().getTask();
    }

    @Override
    public void run() {
        while(count != target){
            count++;
        }
        ThreadManager.getInstance().decrementRunningThreads();
    }
}
