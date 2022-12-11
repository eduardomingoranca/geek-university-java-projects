import static java.lang.Thread.currentThread;

public class JoinDemo implements Runnable {

    @Override
    public void run() {
        Thread t = currentThread();
        System.out.println("Current thread: " + t.getName());

        // checks if current thread is alive
        System.out.println("Is Alive? " + t.isAlive());
    }
}
