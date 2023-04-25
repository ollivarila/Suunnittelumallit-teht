import java.util.ArrayList;
import java.util.List;

public class ThreadManager {
    private static ThreadManager instance;

    private final static List<Thread> threads = new ArrayList<>();

    private int runningThreads;

    private ThreadManager(){};

    public static ThreadManager getInstance(){
        if(instance == null){
            instance = new ThreadManager();
        }
        return instance;
    }


    public void addThread(Thread thread){
        threads.add(thread);
    }

    public void addRunnable(Runnable runnable){
        threads.add(new Thread(runnable));
    }

    public void startThreads(){
        runningThreads = threads.size();
        System.out.println(runningThreads + " workers started!");
        for(Thread t : threads){
            t.start();
        }
    }

    public synchronized void decrementRunningThreads(){
        runningThreads--;
        System.out.println("Worker stopped, " + runningThreads + " workers remaining.");
    }

    public int getTask() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
}
