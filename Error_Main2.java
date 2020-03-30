/**
 * Error_Main2
 */
public class Error_Main2 {

    public static void main(String[] args) {
        
        // try {
        //     process1();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        Exception origin = null;
        try {
            System.out.println(Integer.parseInt("abc"));
        } catch (Exception e) {
            origin = e;
            throw e;
        } finally {
            Exception e = new IllegalArgumentException();
            if (origin != null) {
                e.addSuppressed(origin);
            }
        }
        
    }

    static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void process2() {
        throw new NullPointerException();
    }

}