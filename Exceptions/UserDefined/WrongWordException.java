package Exceptions.UserDefined;

public class WrongWordException extends Exception {
    public WrongWordException(String errorMessage) {

        super(errorMessage);
    }
}
