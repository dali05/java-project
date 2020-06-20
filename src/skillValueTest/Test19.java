package skillValueTest;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test19 {

    public static void main(String[] args) {
        Supplier<User> s = User::new;
        Function<String, User> f = User::new;
        BiFunction<String, String, User> bf = User::new;
    }

}


class User {
    private String firstName;
    private String lastName;


    User(String firstName) {
        this.firstName = firstName;
    }

    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    User() {

    }
}
