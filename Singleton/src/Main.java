public class Main {
    public static void main(String[] args) {
        ThreadManager tm = ThreadManager.getInstance();

        for(int i = 0; i < 100; i++){
            Worker w = new Worker();
            tm.addRunnable(w);
        }
        tm.startThreads();
    }
}