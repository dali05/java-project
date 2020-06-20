package skillValueTest;


import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;

public class Test24 {

    public static void main(String[] args) {
        LongAccumulator accumulator = new LongAccumulator(Long::sum, 0);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        int t [] = new int[] { 1, 2, 3 , 4,5,6,7,8,9};
        Arrays.stream(t).forEach(i -> executorService.execute(() -> accumulator.accumulate(i)));
        executorService.shutdown();
        while (!executorService.isTerminated()) {

        }
        System.out.println(accumulator.getThenReset());
        System.out.println(accumulator.get());
    }



}
