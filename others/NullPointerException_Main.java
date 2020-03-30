import java.util.Optional;

/**
 * NullPointerException_Main
 */
public class NullPointerException_Main {

    public static void main(String[] args) {
        // String s = null;
        // System.out.println(s.toLowerCase());

        Person p = new Person();
        System.out.println(p.address.city.toLowerCase());

    }

    // public Option<String> readFromFile(String file) {
    //     if (!fileExist(file)) {
    //         return Optional.empty();
    //     }
    // }
}

class Person {
    String[] name = new String[2];
    Address address = new Address();
}
class Address {
    String city;
    String street;
    String zipcode;
}