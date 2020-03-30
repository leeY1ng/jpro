/**
 * Defined_Error
 */
public class Defined_Error {

    public static void main(String[] args) {
        
    }
}

public class BaseException extends RuntimeException {
    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    } 
    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}

public class UserNotFoundException extends BaseException {

}

public class LoginFailedException extends BaseException {

}