package org.milan.sbrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class InvalidUserExceptionController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = InvalidUserException.class)
	public ResponseEntity<Object> exception(InvalidUserException invalidUserException) {
		System.out.println("here Test");
		return new ResponseEntity<Object>("User Not Present", HttpStatus.NOT_FOUND);
	}

}
