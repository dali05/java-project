package skillValueTest;

import java.io.File;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {


    public static void main(String[] args) {
       /* Comparator<String> alphabetical =  new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };

        Comparator<String> size = (s1, s2) -> s1.length() - s2.length();
        List<String> collect = IntStream.range(1, 5).boxed()
                .map((i) -> i.toString())
                .sorted(alphabetical.thenComparing(size))
                .collect(Collectors.toList());*/


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "adem");
        map.put(2, "Eve");
        map.put(3, null);
        String s1 = map.get(1);
        String s2 = map.getOrDefault(2,"mary");
        String s3 = map.getOrDefault(3,"jack");
        String s4 = map.getOrDefault(4,"annee");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);



    }
}
