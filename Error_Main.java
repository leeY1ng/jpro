import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Error_Main
 */
public class Error_Main {

    public static void main(String[] args) {
        // byte[] bs = toGBK("中文");
        // System.out.println(Arrays.toString(bs));

        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void process1() {
        process2();
    }
    static void process2() {
        Integer.parseInt(null);
    }

    static void process3(String s) {
        if (s==null) {
            throw new NullPointerException();
        }
    }

    static void process4(String s) {
        try {
            process2();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void process5(String s){
        if (s==null) {
            throw new NullPointerException();
        }
    }

    // static byte[] toGBK(String s){
    //     try {
    //         return s.getBytes("GBK");
    //     } catch (Exception e) {
    //         System.out.println(e);
    //         return s.getBytes();
    //     }
    //     return s.getBytes("GBK");
    // }

    // static byte[] toGBK(String s) throws UnsupportedEncodingException {
    //     return s.getBytes("GBK");
    // }

    // static byte[] toGBK(String s){
    //     try {
    //         return s.getBytes("GBK");
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     } catch (IOException | NumberFormatException e) {

    //     }
    //     return s.getBytes("GBK");
    // }
}
