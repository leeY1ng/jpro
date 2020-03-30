import java.util.ArrayList;
import java.util.Collection;

/**
 * Interface_Main
 */
public class Interface_Main {

    public static void main(String[] args) {
        
    }
}

// abstract class Person {
//     public abstract void run();
//     public abstract String getName();
// }

interface Hello {
    void sayHello();
}

interface Person extends Hello {
    void run();
    String getName();
}

class Student implements Person {
    private String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println(this.name+"run");
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void sayHello() {
        System.out.println("say hello!");
    }
}

// List list = new ArrayList(); 用list接口引用具体子类的实例
// Collection coll = list; 向上转型为collection接口
// Iterable it = coll; 向上转型为iterable接口