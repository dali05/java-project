package skillValueTest;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable{
    private static LocalTime NOW = LocalTime.now();
    private int offset;


    public WorkerThread(int offset) {
        this.offset = offset;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e){ }
        NOW.plusHours(offset);
        System.out.println(DateTimeFormatter.ofPattern("HH:mm").format(NOW));
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new WorkerThread(i));
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) { }
    }
}
