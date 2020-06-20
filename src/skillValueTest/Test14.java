package skillValueTest;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class Test14 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> numbers = new Random().ints(5000000, 0, 9)
                .boxed()
                .collect(Collectors.toList());
        CompletableFuture<Long> countZeros = CompletableFuture.supplyAsync(() ->
                numbers.stream().filter(n -> n == 0).count());


        CompletableFuture<Long> countOnes = CompletableFuture.supplyAsync(() ->
                numbers.stream().filter(n -> n == 1).count());
        countZeros.thenCombine(countOnes,Long::sum).thenAccept(System.out::print).get();

    }

}
