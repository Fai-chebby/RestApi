package demo.example.userapplication.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
@Setter
public class UserException {
    private final String message;
    private final Throwable throwable;
    private  final HttpStatus httpStatus;
}
