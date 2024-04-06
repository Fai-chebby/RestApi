package Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class LaundryExceptionHandler {

    @ExceptionHandler(LaundryApplicationNotFoundException.class)
    public ResponseEntity<Object> handleLaundryApplicationNotFoundException
            (LaundryApplicationNotFoundException laundryApplicationNotFoundException)
    {
        LaundryException laundryException= new LaundryException(
                laundryApplicationNotFoundException.getMessage(),
                laundryApplicationNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(laundryException ,HttpStatus.NOT_FOUND);
    }
}
