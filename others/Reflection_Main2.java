import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Reflection_Main2
 */
public class Reflection_Main2 {

    public static void main(String[] args) {
        
        // LogFactory factory = null;
        // if (isClassPresent("org.apache.logging.log4j.logger")) {
        //     factory = crearteLog4j();
        // } else {
        //     factory = createJkdLog();
        // }

        // static boolean isClassPresent(String name) {
        //     try {
        //         Class.forName(name);
        //     } catch (Exception e) {
        //         return false;
        //     }
        // }
        // try {
        //     Class stdClass = Student.class;

        //     System.out.println(stdClass.getField("score").getName());

        //     System.out.println(stdClass.getField("name").getType());

        //     System.out.println(stdClass.getDeclaredField("grade").getModifiers());

        //     System.out.println("1、 "+stdClass.getFields());
        //     System.out.println("2、 "+stdClass.getDeclaredFields());
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        // try {
        //     Field f = String.class.getDeclaredField("value");
        //     f.getName();
        //     f.getType();
        //     int m = f.getModifiers();

        //     Modifier.isFinal(m);
        //     Modifier.isPublic(m);
        //     Modifier.isProtected(m);
        //     Modifier.isPrivate(m);
        //     Modifier.isStatic(m);
        // } catch (Exception e) {
        //     //TODO: handle exception
        // }

        // try {
        //     Object p = new Person1("xiao ming");
        //     Class c = p.getClass();
        //     Field f = c.getDeclaredField("name");
        //     f.setAccessible(true);
        //     Object value = f.get(p);
        //     System.out.println("value: "+value);
        // } catch (Exception e){
        //     System.out.println(e);
        // }

        try {
            Person1 p = new Person1("xiao hong");
            System.out.println(p.getName());

            Class c = p.getClass();
            Field f = c.getDeclaredField("name");
            f.setAccessible(true);
            f.set(p, "xiao ming");
            System.out.println(p.getName());
        } catch (Exception e) {
                System.out.println(e);
        }
    }
}

class Student extends Person {
    public int score;
    private int grade;
}

class Person {
    public String name;
}

// public final class String {
//     private final byte[] value;
// }

class Person1 {
    private String name;

    public Person1(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}