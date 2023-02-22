package ticTacToe.exceptions;

public class InvalidGameCreationParameteresException extends RuntimeException{

    public InvalidGameCreationParameteresException() {
    }

    public InvalidGameCreationParameteresException(String message) {
        super(message);
    }

    public InvalidGameCreationParameteresException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGameCreationParameteresException(Throwable cause) {
        super(cause);
    }

    public InvalidGameCreationParameteresException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
