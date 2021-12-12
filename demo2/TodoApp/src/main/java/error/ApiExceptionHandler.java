package error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ApiExceptionHandler {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErrorDetails> handleException (NotFoundException ex , WebRequest request){
		ErrorDetails details = new ErrorDetails(ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(details , ex.getStatusCode());
	}
}
