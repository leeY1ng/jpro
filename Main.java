/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        var p = new Person("summer", 15);
        System.out.println("name: "+p.getName()+" age: "+p.getAge());

        var p2 = new Person();
        System.out.println("name: "+p2.getName()+" age: "+p2.getAge());

        var p3 = new Person("winter");
        System.out.println("name+ "+p3.getName()+" age: "+p3.getAge());

        var h1 = new Hello();
        h1.hello();
        h1.hello("summer");
        h1.hello("winter", 12);
        h1.hello("spring", 20);

        Students s1 = new Students("summer",2,99);
        System.out.println(s1.getName()+" "+s1.getAge()+" "+s1.getScore());

        p.run();
        s1.run();
    }

}

class Person {
    protected String name;
    protected int age ;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this(name, 16);
    }

    public Person(){
        this("unamed");
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void run(){
        System.out.println("person.run()");
    }
}

class Students extends Person {
    protected int score;

    public Students(String name,int age,int score){
        super(name, age);
        this.score=score;
    }

    public int getScore(){
        return this.score;
    }
    @Override
    public void run(){
        System.out.println("student.run");
    }
}

class Hello {
    public void hello(){
        System.out.println("hello");
    }

    public void hello(String name){
        System.out.println("hello "+name);
    }

    public void hello(String name, int age){
        if(age<18){
            System.out.println("hi "+name+"!");
        } else {
            System.out.println("hello "+name+"!");
        }
    }
}
