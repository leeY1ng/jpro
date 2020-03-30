import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Fanxing_shiyong
 */
public class Fanxing_shiyong {

    public static void main(String[] args) {
        // List list = new ArrayList();
        // list.add("hello");
        // list.add("world");
        // String first = (String) list.get(0);
        // String second = (String) list.get(1);

        // List<String> list1 = new ArrayList<String>();
        // list1.add("he");
        // list1.add("wor");

        // String first = list1.get(0);
        // String second = list1.get(1);
        // System.out.println(first);
        // System.out.println(second);

        // List<Number> num = new ArrayList<>();

        // String[] ss = new String[] {"orange","apple","pear"};
        // Arrays.sort(ss);
        // System.out.println(Arrays.toString(ss));


        Person[] ps = new Person[] {
            new Person("bob", 61),
            new Person("alice", 88),
            new Person("lily", 75)
        };
        Arrays.sort(ps);
        System.err.println(Arrays.toString(ps));
    }

    
}

// class Person {
//     String name;
//     int score;

//     Person(String name, int score) {
//         this.name = name;
//         this.score = score;
//     }
//     public String toString() {
//         return this.name+" , "+this.score;
//     }
// }

class Person implements Comparable<Person> {
    String name;
    int score;
    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
    public String toString() {
        return this.name + ","+ this.score;
    }
}