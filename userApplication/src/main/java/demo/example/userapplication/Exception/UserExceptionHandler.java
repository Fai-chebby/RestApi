package demo.example.userapplication.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UserExceptionHandler {
    public ResponseEntity<Object> handleUserNotFoundException
            (UserNotFoundException  userNotFoundException){
        UserException userException =new UserException(
                userNotFoundException.getMessage(),
                userNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return  new ResponseEntity<>(userException,HttpStatus.NOT_FOUND);
    }
}
