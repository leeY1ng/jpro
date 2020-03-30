/**
 * Logging_Main
 */

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Logging_Main {

    public static void main(String[] args) {
        Logger log1 = Logger.getGlobal();
        log1.info("start process ...");
        log1.warning("memory is running out ...");
        log1.fine("ignored.");
        log1.severe("process will be terminated ...");

        Logger log2 = Logger.getLogger(Logging_Main.class.getName());
        log2.info("start process ...");

        try {
            "".getBytes("invaildCharserName");
        } catch (UnsupportedEncodingException e) {
            log2.severe("print error");
        }
        log2.info("press end");
    }
}