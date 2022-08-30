package Exceptions.UserDefined;

public class OperatorValidationException extends Exception{
    public OperatorValidationException(String errorMessage) {
        super(errorMessage);
    }
}
