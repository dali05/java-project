package skillValueTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Optional;

public class Test26 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User26 user = new User26(12, "john");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(user);
        byte[] cache = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(cache);
        User26 revived = (User26) new ObjectInputStream(bis).readObject();
        System.out.println(revived.getAge() + " " + revived.getName());
    }

}



class User26 {
        private int age;
        private Optional<String> name;

    User26(int age, String name) {
        this.age = age;
        this.name = Optional.ofNullable(name);
    }

    public int getAge() {
        return age;
    }

    public Optional<String> getName() {
        return name;
    }
}
