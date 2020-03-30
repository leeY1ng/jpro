/**
 * Static_Main
 */
public class Static_Main {

    public static void main(String[] args) {
        Person ming = new Person("xiaoming", 12);
        Person hong = new Person("xiaohong", 15);
        
        Person.setNumber(123);
        System.out.println(Person.number);
    }
}

class Person {
    public String name;
    public int age;

    public static int number;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void setNumber(int value){
        number = value;
    }
}

public interface Person1 {
    int MALE=1;
    int FEMALE=2;
}