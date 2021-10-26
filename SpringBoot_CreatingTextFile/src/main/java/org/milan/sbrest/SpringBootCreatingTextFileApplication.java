package org.milan.sbrest;

import org.milan.sbrest.writer.TextFileWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCreatingTextFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCreatingTextFileApplication.class, args);
		TextFileWriter textFileWriter = new TextFileWriter();
		textFileWriter.createTextFile();
//		String check = textFileWriter.dateAndTime();
//		System.out.println("1212 " + check);
	}

}
