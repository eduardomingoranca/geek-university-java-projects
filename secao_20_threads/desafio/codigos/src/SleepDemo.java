import static java.lang.Thread.currentThread;

public class SleepDemo implements Runnable {
    Thread t;

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(currentThread().getName() + "  " + i);
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
