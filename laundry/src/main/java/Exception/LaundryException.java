package Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@Getter
@Setter
public class LaundryException {
    private final String Message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
}
