/**
 * Created by Wei Shi on 2017/3/17.
 */
public class ThreadDemo extends Thread {
    private Thread t;
    private String tName;
    public ThreadDemo(String name) {
        tName = name;
        System.out.println("Creating " + tName);
    }

    public void run() {
        System.out.println("Running " + tName);
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Thread: " + tName + ", Step: " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + tName + " interrupted!");
        }
        System.out.println("Thread " + tName + " finished.");
    }

    public void start() {
        System.out.println("Starting" + tName);
        if (t == null) {
            t = new Thread(this, tName);
        }
        t.start();
    }
}
