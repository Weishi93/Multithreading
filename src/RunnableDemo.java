/**
 * Created by Wei Shi on 2017/2/26.
 */
public class RunnableDemo implements Runnable {
    private Thread thread;
    private String name;
    public RunnableDemo(String name) {
        this.name = name;
        System.out.println("Creating " + this.name + " thread!");
    }

    @Override
    public void run() {
        System.out.println("Running " + name + " thread!");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + name + " is " + i);
                thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " is interrupted.");
        }
        System.out.println("Thread " + name + " exits!");
    }

    public void start() {
        System.out.println("Starts " + name);
        if (thread == null) {
            thread = new Thread(this, name);
        }
        thread.start();
    }
}
