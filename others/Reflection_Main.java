/**
 * Reflection_Main
 */



public class Reflection_Main {

    public static void main(String[] args) {
        // //1.
        // Class cls1 = String.class;
        // System.out.println(cls1);

        // //2.
        // String s = "hello";
        // Class cls2 = s.getClass();
        // System.out.println(cls2);

        // //3.

        // try {
        //     Class cls3 = Class.forName("java.lang.String");
        //     System.out.println(cls3);

        //     boolean b1 = cls1 == cls2;
        //     boolean b2 = cls1 == cls3;
        //     boolean b3 = cls2 == cls3;

        //     System.out.println(b1+" : "+b2+" : "+b3);

        // } catch (Exception e) {
        //     System.out.println(e);
        // } finally {
            
        // }

        // Class i1 = Integer.class;
        // System.out.println(i1);
        // Integer i = 123;
        // Class i2 = i.getClass();
        // System.out.println(i2);
        // try {
        //     Class i3 = Class.forName("java.lang.Array");
        //     System.out.println(i3);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }


        // Integer n = Integer.valueOf(123);
        // boolean n1 = n instanceof Integer;
        // boolean n2 = n instanceof Number;

        // boolean n3 = n.getClass() == Integer.class;
        // try {
        //     // boolean n4 = n.getClass() == Number.class;  
        //     // System.out.println(n4);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        

        // System.out.println(n1+" | "+n2+" | "+n3);


        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);

    }

    static void printClassInfo(Class cls) {
        System.out.println("------class name: "+cls.getName());
        System.err.println("simple name"+cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("package name:"+ cls.getPackage().getName());
        }

        System.out.println("is interface:"+cls.isInterface());
        System.out.println("is enum:"+cls.isEnum());
        System.out.println("is array:"+cls.isArray());
        System.out.println("is primitive:"+cls.isPrimitive());
    }

}