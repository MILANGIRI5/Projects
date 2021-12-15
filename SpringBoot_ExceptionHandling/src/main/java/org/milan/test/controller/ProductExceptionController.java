/**
 * 
 */
package org.milan.test.controller;

import org.milan.test.exception.ProductNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Milan
 *
 */
@RestController
@ControllerAdvice
public class ProductExceptionController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = ProductNotFound.class)
	public ResponseEntity<Object> exception(ProductNotFound productNotFound) {

		return new ResponseEntity<Object>("Product Not Found", HttpStatus.NOT_FOUND);

	}
}
