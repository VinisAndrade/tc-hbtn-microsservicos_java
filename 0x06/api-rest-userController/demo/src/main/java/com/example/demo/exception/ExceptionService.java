import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionService {

    @ExceptionHandler
    public ResponseEntity<UserErrorResponse> handleException(UserIdException err) {
        UserErrorResponse uer = new UserErrorResponse(HttpStatus.BAD_REQUEST.value(), "You have entered invalid ID: " + err.getMessage());
        return new ResponseEntity<>(uer, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<UserErrorResponse> handleException(UserNameException err) {
        UserErrorResponse uer = new UserErrorResponse(HttpStatus.BAD_REQUEST.value(), "You have entered invalid USERNAME: " + err.getMessage());
        return new ResponseEntity<>(uer, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<UserErrorResponse> handleException(CPFException err) {
        UserErrorResponse uer = new UserErrorResponse(HttpStatus.BAD_REQUEST.value(), "You have entered invalid CPF: " + err.getMessage());
        return new ResponseEntity<>(uer, HttpStatus.BAD_REQUEST);
    }
}