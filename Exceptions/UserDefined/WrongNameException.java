package Exceptions.UserDefined;

public class WrongNameException extends Exception {

    public WrongNameException(String errorMessage) {
        super(errorMessage);
    }

}
