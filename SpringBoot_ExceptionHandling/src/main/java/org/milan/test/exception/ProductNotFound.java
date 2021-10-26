/**
 * 
 */
package org.milan.test.exception;

/**
 * @author Milan
 *
 */
//Also can use Throwable
public class ProductNotFound extends RuntimeException {

	public ProductNotFound(String msg) {
		super(msg);
	}
}
