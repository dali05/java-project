package skillValueTest;

import java.util.Optional;

public class Test43 {

    public static void main(String[] args) {
         City city = new City("London");
         Address address = new Address(null);
         Employee employee = new Employee(address);

         String cityName = employee.getAddress().flatMap(Address::getCity)
                 .map(City::getName).orElse("empty");
        System.out.println(cityName);
    }

}

class City {
    private String name;

    City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Address {
    private Optional<City> city;

    Address(City city) {
        this.city = Optional.ofNullable(city);
    }

    public Optional<City> getCity() {
        return city;
    }
}

class Employee {
    private Optional<Address> address;

    Employee(Address address) {
        this.address = Optional.ofNullable(address);
    }

    public Optional<Address> getAddress() {
        return address;
    }
}
