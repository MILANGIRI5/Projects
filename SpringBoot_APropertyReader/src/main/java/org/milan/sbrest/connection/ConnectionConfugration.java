/**
 * 
 */
package org.milan.sbrest.connection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Milan
 *
 */

@Configuration // mandatory //Used to automatically pick-up data from 
//@EnableConfigurationProperties
public class ConnectionConfugration {

	@Value("${sftp.hostname}") // mandatory
	private String HOST_NAME;

	@Value("${sftp.username}")
	private String USER_NAME;

	@Value("${sftp.password}")
	private String PASSWORD;

	@Bean // mandatory
	public void getDetails() {
		System.out.println("Get Details Method");
		System.out.println(HOST_NAME + " " + USER_NAME + " " + PASSWORD);
	}
}
