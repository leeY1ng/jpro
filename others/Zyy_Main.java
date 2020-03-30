/**
 * Zyy_Main
 */
public class Zyy_Main {

    public static void main(String[] args) {
        Inner i = new Inner();
        i.hi();
    }

    private static void hello() {
        System.out.println("private hello");
    }
    static class Inner {
        public void hi() {
            Zyy_Main.hello();
        }
    }
}

