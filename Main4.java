/**
 * Main4
 */
public class Main4 {

    public static void main(String[] args) {
        Person p = new Student();
        p.run();
    }
}

abstract class Person {
    public abstract void run();
}

class Student extends Person {
    @Override
    public void run(){
        System.out.println(123);
        
    }
}