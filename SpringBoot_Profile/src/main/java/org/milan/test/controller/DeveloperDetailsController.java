/**
 * 
 */
package org.milan.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Milan
 *
 */
@RestController
public class DeveloperDetailsController {

	@GetMapping("/dev")
	public String print() {
		return "Welcome Developer";
	}

	// reading the properties from dev-profile yml file and mapping it to urls

	@Value("${spring.application.name}")
	private String appName;

	@GetMapping("/App")
	public String applicationName() {
		return appName;
	}

	@Value("${developer.name}")
	private String developerName;

	@GetMapping("/name")
	public String name() {
		return developerName;
	}

	@Value("${developer.skill}")
	private String devSkill;

	@GetMapping("/skill")
	public String devSkill() {
		return devSkill;
	}
}
