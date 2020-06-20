package p1;

public class Test {


    transient int a;

    public static void main(String... dali) {
        Test t = new Test();
        System.out.println(t.a);

    }

}