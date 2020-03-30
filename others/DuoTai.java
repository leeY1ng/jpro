import java.lang.reflect.Method;

/**
 * DuoTai
 */
public class DuoTai {

    public static void main(String[] args) {
        
        try {
            Method h = Person.class.getMethod("hello");
            h.invoke(new Student());

            // Person p = new Person();
            // p.hello();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/**
 * Person
 */
class Person {
    
    public void hello() {
        System.out.println("person:hello");
    }
}

class Student extends Person {
    public void hello() {
        System.out.println("student:hello");
    }
}