package p3;

public class Base {


    public <T extends Form, d extends Animal> T showAnimal(d vo, Class<?> bvoClass) {
        System.out.println();
        return null;

    }


    public Animal showAnimal(Animal a) {
        System.out.println(a);
        return null;
    }


}
