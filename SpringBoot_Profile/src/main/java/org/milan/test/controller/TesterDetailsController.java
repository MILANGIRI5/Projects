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
public class TesterDetailsController {

	@GetMapping("/test")
	public String print() {
		return "Welcome Tester";
	}

	// reading the properties from QA-profile yml file and mapping it to urls

	@Value("${spring.application.name}")
	private String appName;

	@GetMapping("/tApp")
	public String applicationName() {
		return appName;
	}

	@Value("${qatester.name}")
	private String testerName;

	@GetMapping("/tname")
	public String name() {
		return testerName;
	}

	@Value("${qatester.skill}")
	private String testerSkill;

	@GetMapping("/tskill")
	public String devSkill() {
		return testerSkill;
	}
}
