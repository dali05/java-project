package skillValueTest;

import java.util.Arrays;
import java.util.List;

public class Test34 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 78, 20, 14, 57, 23);
        list.stream().peek(i -> System.out.println("Initial " + i))
                .filter(i -> i % 2 == 0).peek(i -> System.out.println("Filtered " + i)).count();
    }

}
