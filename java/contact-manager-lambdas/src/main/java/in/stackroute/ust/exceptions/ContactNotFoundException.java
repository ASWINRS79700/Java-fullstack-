package in.stackroute.ust.exceptions;

public class ContactNotFoundException extends RuntimeException {

    public ContactNotFoundException(String message) {
        super(message);
    }
}
