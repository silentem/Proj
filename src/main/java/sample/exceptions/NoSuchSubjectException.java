package sample.exceptions;

public class NoSuchSubjectException extends RuntimeException{
    public NoSuchSubjectException(String message) {
        super(message);
    }
}
