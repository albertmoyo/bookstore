package za.co.bookstore.exception;

public class BookResourceNotFoundException extends RuntimeException {
    public BookResourceNotFoundException(String message) {
        super(message);
    }
}
