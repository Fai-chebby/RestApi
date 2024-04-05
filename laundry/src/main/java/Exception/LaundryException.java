package Exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
public class LaundryException {
    private final String Message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
}
