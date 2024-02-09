package demo.example.userapplication.Exception;

import org.springframework.http.HttpStatus;

public class UserException {
    private final String message;
    private final Throwable throwable;
    private  final HttpStatus httpStatus;
}
