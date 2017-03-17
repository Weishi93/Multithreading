/**
 * Created by Wei Shi on 2017/2/26.
 */
public class TestThread {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("t1");
        r1.start();
        RunnableDemo r2 = new RunnableDemo("t2");
        r2.start();
        ThreadDemo t1 = new ThreadDemo("t1");
        ThreadDemo t2 = new ThreadDemo("t2");
        t1.start();
        t2.start();
    }
}
