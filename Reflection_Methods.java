import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Reflection_Methods
 */
@SuppressWarnings("unchecked")
public class Reflection_Methods {

    public static void main(String[] args) {
        try {
            Class stdClass = Student.class;
            System.out.println(stdClass.getMethod("getScore", String.class));

            System.out.println(stdClass.getMethod("getName"));

            System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));

            String s = "Hello World";
            // String r = s.substring(1);
            // System.out.println(r);

            Method m = String.class.getMethod("substring", int.class);
            String r = (String)m.invoke(s, 1);
            System.out.println(r);

            Method mm = Integer.class.getMethod("parseInt", String.class);
            Integer rr = (Integer)mm.invoke(null, "123");
            System.out.println(rr);

            Person p = new Person();
            Method mmm = p.getClass().getDeclaredMethod("setName", String.class);
            mmm.setAccessible(true);
            mmm.invoke(p, "summer");
           System.out.println(p.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


class Student extends Person {
    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 1;
    }
}

class Person {
    String name;
    public String getName() {
        return "Person";
    }

    private void setName(String name) {
        this.name = name;
    }
}