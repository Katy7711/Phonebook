package NumberAlreadyExistsException;

public class NumberAlreadyExistsException extends RuntimeException {
    public NumberAlreadyExistsException() {
    }

    public NumberAlreadyExistsException(String message) {
        super(message);
    }
}
