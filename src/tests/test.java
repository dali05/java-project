package tests;

import org.hamcrest.Condition;
import p1.Animal;
import p1.Chien;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class test {
    static void  print (Reader reader) throws IOException {
        int code = reader.read();
        while(code != -1) {
           // System.out.print((char) code);
            code = reader.read();
        }
        reader.close();
    }
    public static void main(String... args) throws IOException {
//        for(String s : args) {
//           // System.out.println(s.toString());
//        }
//
//
//
//        StringBuilder builder = new StringBuilder();
//       /* for(String s : args) {
//            builder.append(s);
//            builder.append("\n");
//        }*/
//       // System.out.println(builder.toString());
//
//        String[] strings  = {"f", "o", "o", "bar"};
//        for(String s : strings) {
//            builder.append(s);
//        }
//       //System.out.println(builder.toString());
//
//                Animal animal = new Animal(1, "test");
//        Animal animal2 = new Animal(2, "test2");
//        Animal animal3 = new Animal(3, "tes3");
//        Chien c1 = new Chien(1,"red");
//        Chien c2 = new Chien(2,"red2");
//        Chien c3 = new Chien(3,"re3");
//        List<Animal> animals = new ArrayList<>();
//        animals.add(animal);
//        animals.add(animal2);
//        animals.add(animal3);
//        List<Chien> chiens = new ArrayList<>();
//        chiens.add(c1);
//        chiens.add(c2);
//        chiens.add(c3);
//
//
//
//
//        animals = animals.stream().filter(e -> e.getId() == 1).collect(Collectors.toList());
//        //animals.forEach(e-> System.out.println(e.toString()));
//
//
//        Reader example = new StringReader("Hello");
//        print(example);
//        int[] numbers = { 1, 6, 4, 8, 2 };
//         Arrays.stream(numbers).max().getAsInt();
//        OptionalInt a = Arrays.stream(numbers).filter(e -> e ==5).findFirst();
//        boolean a2 = Arrays.stream(numbers).allMatch(e -> e == 5);
//        //System.out.println(a.isPresent());
//        int sum = Arrays.stream(numbers).filter((e) -> e >= 10 && e <= 100).sum();
//
//        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
//        integers.stream().mapToInt((x) ->x).summaryStatistics();
//        //System.out.println(sum);
//
//        System.out.println(Integer.toBinaryString(2 >> 1));
        int[] numbers = { 1, 6, 4, 8, 2 };
        int inter = numbers[0];

        for(int i = 0; i< numbers.length-1; i++) {
            for(int j = i+1; j< numbers.length; j++) {
                if (numbers[i] - numbers[j] < inter &&  numbers[i] - numbers[j] > 0) {
                    inter = numbers[i] - numbers[j];
                } else if (numbers[j] - numbers[i]< inter &&  numbers[j] - numbers[i] > 0)  {
                    inter = numbers[j] - numbers[i];
                }
            }

        }
        // System.out.println(inter);

    //    System.out.println(5 / 2);

        //System.out.println(Integer.toBinaryString(10 || 11));

        System.out.println(calc());

    }

        public static int calc() {
            String name = null;
            try {
                name.equals("");
                } catch (Exception e) {
                    return 0;
                }
                    return 1;


        }




}
