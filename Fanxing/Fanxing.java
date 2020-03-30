/**
 * Fanxing
 */
public class Fanxing {

    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // list.add("Hello");
        // String first = (String) list.get(0);

        ArrayList<String> strList = new ArrayList<String>();
        ArrayList<Float> floatList = new ArrayList<Float>();
        ArrayList<Person> personList = new ArrayList<Person>();

        strList.add("hello");
        String s = strList.get(0);
        strList.add(new Integer(123));
        Integer n = strList.get(0);
        
    }
    public class StringArrayList {
        private String[] array;
        private int size;
        public void add(String e) {

        }
        public void remobe(int index) {
            
        }
        public Strin get(int index) {
            
        }
    }

    public class ArrayList {
        private Object[] array;
        private int size;
        public void add(Object e) {

        }
        public void remove(int index) {

        }
        public Object get(int index) {

        }

    }

    public class ArrayList<T> {
        private T[] arrary;
        private int size;
        public void add(T e){

        }
        public void remove(int index) {

        }
        public T get(int index) {
            
        }
    }

}

public class ArrayList<T> implements List<T> {
    
}