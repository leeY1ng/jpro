import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Jihe_ArrayList
 */
public class Jihe_ArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("apple");
        list.add(null);
        System.out.println(list.get(3));
        for (String str : list) {
            System.out.println(str);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());

        List<Integer> list1 = List.of(1, 2, 3);
        System.out.println(list1.size());

        List<String> list2 = List.of("apple", "pear", "banana");
        for (Iterator<String> it = list2.iterator(); it.hasNext();) {
            String s = it.next();
            System.out.println(s);
        }
        // List<Person<String,Integer>> list3 = list.of(new Person("summer", 12),new
        // Person("spring", 8));
        // for(Iterator<Person> is = list3.iterator(); is.hasNext(); ) {
        // Person<String, Integer> p = it.hasNext();
        // System.out.println(p);
        // }

        // List<String> list3 = List.of("apple", "pear", "banana");
        // Object[] array1 = list3.toArray();
        // for (Object obj : array1) {
        //     System.out.println("obj:"+obj.hashCode());
        //     System.out.println(obj);
        // }        

        // List<Integer> list4 = List.of(12,34,56);
        // Integer[] array2 = list4.toArray(new Integer[3]);
        // for (Integer n : array2) {
        //     System.out.println(n);
        // }
        // Integer[] arr1 = list.toArray(new Integer(list4.size()));
        // Integer[] arr2 = list.toArray(Integer[]::new);

        Integer[] arr3 = {1,2,3};
        List<Integer> list5 = List.of(arr3);

        List<String> list6 = List.of("A","B","C");
        System.out.println(list6.contains("c"));
        System.out.println(list6.contains("x"));
        System.out.println(list6.indexOf("A"));
        System.out.println(list6.indexOf("X"));
        System.out.println("----------");
        System.out.println(list6.contains(new String("C")));
        System.out.println(list6.indexOf(new String("C")));
        System.out.println("----------");
        System.out.println(new String("A").equals(list6.get(0)));

    }   
}

// class Person<T> {
//     private T name;
//     private T age;

//     public Person(T name, K age) {
//         this.name = name;
//         this.age = age;
//     }

//     public void setName(T name) {
//         this.name = name;
//     }

//     public T getName() {
//         return name;
//     }

//     public void setAge(K age) {
//         this.age = age;
//     }

//     public K getAge() {
//         return age;
//     }
// }