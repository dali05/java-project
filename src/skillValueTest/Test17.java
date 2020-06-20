package skillValueTest;

public class Test17 {

        interface I1 {
            default void log() {
                System.out.println("Hello from I1");
            }
        }

    interface I2 extends I1 {
        void log();
    }

    abstract class C1 implements I1,I2 {

    }

}
