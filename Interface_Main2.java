/**
 * Interface_Main2
 */
public class Interface_Main2 {

    public static void main(String[] args) {
        Person p = new Student("xiao ming");
        p.run();
    }
}

interface Person {
    String getName();
    default void run(){
        System.out.println(getName()+" run");
    }
}

class Student implements Person {
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}