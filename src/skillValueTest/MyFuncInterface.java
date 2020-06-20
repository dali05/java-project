package skillValueTest;

public interface MyFuncInterface {

    default long returnOne() {
        return 1L;
    }

    long getLong();

    static int returnTwo() {
        return 2;
    }

}

class test {
    public static void main(String[] args) {
            MyFuncInterface m1 = () -> 10L;
            MyFuncInterface m2 = System::currentTimeMillis;
            MyFuncInterface m3 = MyFuncInterface::returnTwo;
        }
}
