import java.lang.reflect.Constructor;

/**
 * Gouzao
 */
public class Gouzao {

    public static void main(String[] args) {    

        try {
            Constructor p1 = Integer.class.getConstructor(int.class);
            Integer n1 = (Integer)p1.newInstance(123);
            System.out.println(n1);

            Constructor p2 = Integer.class.getConstructor(String.class);
            Integer n2 = (Integer)p2.newInstance("456");
            System.out.println(n2);

            Constructor p3 = String.class.getConstructor(String.class);
            String n3 = (String)p3.newInstance("abc");
            System.out.println(n3);

            Class i = Integer.class;
            Class n = i.getSuperclass();
            System.out.println(n);
            Class o = n.getSuperclass();
            System.out.println(o);
            System.out.println(o.getSuperclass());

            Class s = Integer.class.getSuperclass();
            Class[] is = s.getInterfaces();
            for (Class ii : is) {
                System.out.println(ii);
            }

            System.out.println(Integer.class.isAssignableFrom(Integer.class));
            System.out.println(Number.class.isAssignableFrom(Integer.class));
            System.out.println(Object.class.isAssignableFrom(Integer.class));
            System.out.println(Integer.class.isAssignableFrom(Number.class));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Person {
    String name;

}