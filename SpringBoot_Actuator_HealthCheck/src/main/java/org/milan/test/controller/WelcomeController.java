/**
 * 
 */
package org.milan.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Milan
 *
 */
@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String printMsg() {
		return "Actuator Health Check of a Project";
	}
}
