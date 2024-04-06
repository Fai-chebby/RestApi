package Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class LaundryExceptionHandler {
    public ResponseEntity<Object> handleLaundryApplicationNotFoundException
            (LaundryApplicationNotFoundException laundryApplicationNotFoundException)
    {
        LaundryException laundryException= new LaundryException(
                laundryApplicationNotFoundException.getMessage(),
                laundryApplicationNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
    }
}
