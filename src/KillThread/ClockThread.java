package KillThread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockThread implements Runnable {
    private SimpleDateFormat sdf;

    public ClockThread() {
        super();
        sdf = new SimpleDateFormat("HH:mm:ss");
    }

    public ClockThread(String format) {
        sdf = new SimpleDateFormat(format);
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();

        for (; !th.isInterrupted(); ) {
            System.out.println(sdf.format(new Date()));

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("The clock thread stopped");
    }
}
